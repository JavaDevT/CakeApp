package com.cakeshop.org.view.accounts;


import com.cakeshop.org.model.UserDetails;
import com.cakeshop.org.model.baseresponse.BaseResponse;
import com.cakeshop.org.utils.ResponseHandler;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

@Controller
public class AccountMgmtController {

    @Autowired
    @Qualifier(value = "accountsService")
    AccountsService accountsDao;

    @Autowired
    ResponseHandler responseHandler;

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

    @PostMapping("/welcome-user")
    public String welcomseUser(@Validated @RequestBody Object o) {
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

    // @GetMapping("login_user/{username}")
//    @Validated
    //@RequestMapping(value = "/employees/{username}/{password}",method = RequestMethod.GET)
    @GetMapping(path = {"/employees/{username}/{password}"})

    public ResponseEntity<BaseResponse> loginUser(@PathVariable
                                                  String username, @PathVariable
                                                  String password) {
        //  if(result.hasErrors()){
        //      return responseHandler.failureResponse(404, Objects.requireNonNull(result.getFieldError()).toString(), false);
        //  }
        // public String loginUser(@RequestParam Long id) {
        UserDetails data = accountsDao.checkUserLogin(null, username);
        System.out.println(data.getAddressLineOne());
        if (data != null) {
            return responseHandler.successResponse(200, "Success", true, new UserDetails());
        }
        return responseHandler.failureResponse(404, "User not found", false);
    }

    @PostMapping(path = {"/get/image/{name}"})
    public ResponseEntity<?> getImage(@PathVariable("name") String name) throws IOException {
        return ResponseEntity.ok().body("Hi user");

    }

    @PostMapping("/user_register")
    public ResponseEntity<BaseResponse> accountRegister(ModelMap model, @RequestParam String username, @RequestParam String password, @RequestParam String addressLine1, @RequestParam() String addressLine2, @RequestParam() String pinCode, @RequestParam String number) {
        UserDetails details = new UserDetails();
        details.setUsername(username);
        details.setPassword(password);
        details.setAddressLineOne(addressLine1);
        details.setAddressLineTwo(addressLine2);
        details.setPinCode(pinCode);
        details.setMobileNumber(number);
        String data = accountsDao.userRegister(details);

        if (data.equals("success")) {

            return responseHandler.successResponse(200, "Success", true, details);
        }
        return responseHandler.failureResponse(404, data, true);
    }

}