package com.cakeshop.org.view.products;


import com.cakeshop.org.view.addproducts.AddProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class AvailableProductsController {


    @Autowired
    AvailableProductsService availableProductsService;

    @GetMapping("/welcome_admin")
    public String welcomeAdmin() {
        List<AddProducts> data=availableProductsService.getAllProducts();
        return "welcome_admin";
    }
}
