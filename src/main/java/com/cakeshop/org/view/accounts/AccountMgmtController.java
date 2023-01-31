package com.cakeshop.org.view.accounts;


import com.cakeshop.org.model.UserDetails;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountMgmtController {

    @Autowired
    @Qualifier(value = "accountsService")
    AccountsService accountsDao;

    @GetMapping("/login")
    public String login(HttpServletRequest httpServletRequest) {
        if (httpServletRequest.getSession().getAttribute("loginUser") != null) {
            if (httpServletRequest.getSession().getAttribute("loginUser").equals("admin"))
                return "redirect:/welcome_admin";
            else return welcomeUser();
        }
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/welcome-user")
    public String welcomeUser() {
        return "welcome-user";
    }



/*
    @PostMapping("/login_user")
    public ModelAndView accountLogin(ModelMap model, HttpSession httpSession, @RequestParam String username, @RequestParam String userPassword) {
        UserDetails data = accountsDao.checkUserLogin(userPassword, username);
        ModelAndView modelAndView = new ModelAndView();
        if (data != null) {
            if (data.isAdmin()) {
                httpSession.setAttribute("loginUser", "admin");
                modelAndView.setViewName("redirect:/welcome_admin");
            } else {
                httpSession.setAttribute("loginUser", "user");
                modelAndView.setViewName("redirect:/welcome-user");
            }
            modelAndView.addObject("userData", data);
        } else {
            model.addAttribute("userData", "no user found");
            modelAndView.setViewName("redirect:/login");
        }
        return modelAndView;
    }
*/

    @PostMapping("/login_user")
    public String accountLogin(ModelMap model, HttpSession httpSession, @RequestParam String username, @RequestParam String userPassword) {
        UserDetails data = accountsDao.checkUserLogin(userPassword, username);
        if (data != null) {
            if (data.isAdmin()) {
                httpSession.setAttribute("loginUser", "admin");
                return "welcome_admin";
            } else {
                return "redirect:/welcome-user";
            }

        }
        model.addAttribute("userData", "no user found");
        return "login";

    }

    @PostMapping("/user_register")
    public String accountRegister(ModelMap model, @RequestParam String username, @RequestParam String password,
                                  @RequestParam String addressLine1, @RequestParam() String addressLine2,
                                  @RequestParam() String pinCode, @RequestParam String number) {
        UserDetails details = new UserDetails();
        details.setUsername(username);
        details.setPassword(password);
        details.setAddressLineOne(addressLine1);
        details.setAddressLineTwo(addressLine2);
        details.setPinCode(pinCode);
        details.setMobileNumber(number);
        String data = accountsDao.userRegister(details);

        if (data.equals("success")) {
            model.addAttribute("message", "Registered Successfully");
            return "login";
        }
        model.addAttribute("message", data);
        return "register";
    }

}