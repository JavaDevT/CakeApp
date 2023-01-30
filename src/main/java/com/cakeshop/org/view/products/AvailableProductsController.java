package com.cakeshop.org.view.products;


import com.cakeshop.org.view.addproducts.AddProducts;

import jakarta.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
public class AvailableProductsController {


    @Autowired
    AvailableProductsService availableProductsService;

    @GetMapping("/welcome_admin")
    public String welcomeAdmin(ModelMap modelmap ) {
        List<AddProducts> data=availableProductsService.getAllProducts();
        
        System.out.println(data);
        modelmap.addAttribute("productList",data);
        return "welcome_admin";
    }

    @GetMapping("edit_product/{id}")
    public String edit(ModelMap modelmap,@PathVariable String id ) {
       
        System.out.println(id);
         return "welcome_admin";
    }
}
