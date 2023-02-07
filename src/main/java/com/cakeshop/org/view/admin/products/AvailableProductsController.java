package com.cakeshop.org.view.admin.products;


import com.cakeshop.org.model.AddProducts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
public class AvailableProductsController {


    @Autowired
    AvailableProductsService availableProductsService;

    @GetMapping("/welcome_admin")
    public String welcomeAdmin(ModelMap modelmap) {
        List<AddProducts> data = availableProductsService.getAllProducts();

        System.out.println(data);
        modelmap.addAttribute("productList", data);
        return "welcome_admin";
    }

    @GetMapping("/edit_product")
    public ModelAndView edit(RedirectAttributes attributes,@RequestParam(value = "id") int id) {
    	ModelAndView andView=new ModelAndView();

        attributes.addAttribute("product_id", id);
    	andView.setViewName("redirect:/addproducts");
        return andView;
    }
}
