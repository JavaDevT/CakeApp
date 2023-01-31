package com.cakeshop.org.view.addproducts;

import com.cakeshop.org.model.AddProducts;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddProductsController {
    @Autowired
    AddProductsService addProductsService;

    @GetMapping("/addproducts")
    public String addProducts(HttpServletRequest request, Model map, @ModelAttribute("product_id") final String id) {
        if (id != null&&!id.isEmpty()) {
            AddProducts ans = addProductsService.findProducts(Integer.parseInt(id));
            map.addAttribute("editData", ans);
        }
        return "addproducts";
    }

    /*@PostMapping("/add_product")
    public String addProducts(@RequestParam String cakeName, @RequestParam String price,
                              @RequestParam int quantity, @RequestParam(defaultValue = "false") boolean eggLess, @RequestParam String eggImage) {
        AddProducts addProducts = creteProduct(cakeName, price, quantity, eggLess, eggImage);
        int ans = addProductsService.saveProducts(addProducts);
        System.out.println("ans   " + ans);
        return "add_product";
    }*/

    @PostMapping("/add_product")
    public ModelAndView addProducts(ModelMap map, @RequestParam boolean isEditProduct,@RequestParam int  proID, @ModelAttribute("products") AddProducts e, BindingResult br) {
        System.out.println(isEditProduct);
        ModelAndView modelAndView = new ModelAndView();
        if (!isEditProduct) {
            int ans = addProductsService.saveProducts(e);
            if (ans > 0) {
                map.addAttribute("msg", "Cake added successfully");
                modelAndView.setViewName("redirect:/welcome_admin");
            } else {
                map.addAttribute("msg", "Some thing went wrong");
                modelAndView.setViewName("redirect:/addproducts");
            }
            return modelAndView;
        } else {
            e.setId(proID);
            boolean status = addProductsService.upDateProduct(e);
            if (status) {
                map.addAttribute("msg", "Cake updated successfully");
                modelAndView.setViewName("redirect:/welcome_admin");
            } else {
                map.addAttribute("msg", "Some thing went wrong");
                modelAndView.setViewName("redirect:/addproducts");
            }
            return modelAndView;
        }
    }

    private AddProducts creteProduct(String cakeName, String price, int quantity, boolean eggLess, String eggImage) {
        AddProducts addProducts = new AddProducts();
        addProducts.setCakeName(cakeName);
        addProducts.setPrice(price);
        addProducts.setQuantity(quantity);
        addProducts.setEggLess(eggLess);
        addProducts.setCakeImage(eggImage);
      /*  addProducts.setCakeName("cakeName");
        addProducts.setPriceInKg("1");
        addProducts.setQuantity(2);
        addProducts.setEggLess(true);
        addProducts.setCakeImage("kk");*/
        return addProducts;
    }
}
