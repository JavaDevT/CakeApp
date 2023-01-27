package com.cakeshop.org.view.addproducts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddProductsController {
    @Autowired
    AddProductsService addProductsService;

    @GetMapping("/addproducts")
    public String addProducts() {
        AddProducts addProducts = creteProduct("cakeName", "1", 1, true, "d");
        int ans = addProductsService.saveProducts(addProducts);
        System.out.println("ans   " + ans);
        return "addproducts";
    }

    @PostMapping("/add_product")
    public String addProducts(@RequestParam String cakeName, @RequestParam String price,
                                      @RequestParam int quantity, @RequestParam (defaultValue = "false") boolean eggLess, @RequestParam String eggImage) {
        AddProducts addProducts = creteProduct(cakeName, price, quantity, eggLess, eggImage);
        int ans = addProductsService.saveProducts(addProducts);
        System.out.println("ans   " + ans);
        return "add_product";
    }

    private AddProducts creteProduct(String cakeName, String price, int quantity, boolean eggLess, String eggImage) {
        AddProducts addProducts = new AddProducts();
       /* addProducts.setCakeName(cakeName);
        addProducts.setPriceInKg(price);
        addProducts.setQuantity(quantity);
        addProducts.setEggLess(eggLess);
        addProducts.setCakeImage(eggImage);*/
        addProducts.setCakeName("cakeName");
        addProducts.setPriceInKg("1");
        addProducts.setQuantity(2);
        addProducts.setEggLess(true);
        addProducts.setCakeImage("kk");
        return addProducts;
    }
}
