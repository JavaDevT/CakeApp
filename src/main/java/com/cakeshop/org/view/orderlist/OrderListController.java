package com.cakeshop.org.view.orderlist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderListController {
    @GetMapping("/order_list")
    public String orderList() {
        return "order_list";
    }
}
