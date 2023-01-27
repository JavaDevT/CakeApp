package com.cakeshop.org.view.products;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AvailableProducts {

    @GetMapping("/welcome_admin")
    public String welcomeAdmin() {

        return "welcome_admin";
    }
}
