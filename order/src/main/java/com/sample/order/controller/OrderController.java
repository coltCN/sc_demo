package com.sample.order.controller;

import com.sample.order.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/create")
    public String createOrder() {
        orderService.createOrder();
        return "下单成功";
    }
}
