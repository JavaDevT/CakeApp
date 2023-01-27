package com.cakeshop.org.view.vieworder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ViewOrderController {

    @GetMapping("/view_order_details")
    public String viewOrderDetails() {
        return "view_order_details";
    }
}
