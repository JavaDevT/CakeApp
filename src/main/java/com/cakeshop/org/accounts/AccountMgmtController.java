package com.cakeshop.org.accounts;


import com.cakeshop.org.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
  @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/login_user")
    public String accountLogin(ModelMap model, @RequestParam  String username, @RequestParam  String userPassword) {
        UserDetails data = accountsDao.checkUserLogin(userPassword, username);
       //ModelAndView modelAndView = new ModelAndView();
        if (data != null) {
            if (data.isAdmin())
                return "welcome-admin";
            else
                return "welcome-user";

            //modelAndView.addObject("userData", data);
        } else {
            model.addAttribute("userData", "no user found");
            //modelAndView.setViewName("login");
        }
        return "login";
    }
    @PostMapping("/user_register")
    public String accountRegister(ModelMap model, @RequestParam  String username, @RequestParam  String password,
                                  @RequestParam  String addressLine1,  @RequestParam()  String addressLine2,
                                  @RequestParam()  String pinCode,@RequestParam String number) {
        UserDetails details=new UserDetails();
        details.setUsername(username);
        details.setPassword(password);
        details.setAddressLineOne(addressLine1);
        details.setAddressLineTwo(addressLine2);
        details.setPinCode(pinCode);
        details.setMobileNumber(number);
        String data = accountsDao.userRegister(details);

        if (data.equals("success")){
            model.addAttribute("message","Registered Successfully");
            return "login";
        }
        model.addAttribute("message",data);
        return "register";
    }

}