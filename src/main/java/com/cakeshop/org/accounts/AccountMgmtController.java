package com.cakeshop.org.accounts;


import com.cakeshop.org.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountMgmtController {

    @Autowired
    AccountsService accountsDao;


    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/check-login")
    public ModelAndView accountLogin(@RequestParam  String username, @RequestParam  String userPassword) {
        UserDetails data = accountsDao.checkUserLogin(userPassword, username);
        ModelAndView modelAndView = new ModelAndView();
        if (data != null) {
            if (data.isAdmin())
                modelAndView.setViewName("welcome-admin");
            else
                modelAndView.setViewName("welcome-user");

            modelAndView.addObject("userData", data);
        } else {
            modelAndView.addObject("userData", "no user found");
            modelAndView.setViewName("login");
        }
        return modelAndView;
    }
}