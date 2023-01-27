package com.cakeshop.org.view.addproducts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddProductController {
    @GetMapping("/addproducts")
    public String addProducts() {
        return "addproducts";
    }
}
