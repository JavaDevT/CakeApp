package com.cakeshop.org.view.customer.order;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CustomerOrderController {

    @GetMapping("/order")
    public String customerOrder(ModelMap map){
        map.addAttribute("error","am calling");
        return "order.html";
    }
}
