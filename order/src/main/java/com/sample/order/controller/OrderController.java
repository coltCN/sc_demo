package com.sample.order.controller;

import com.sample.api.service.GoodsService;
import com.sample.common.entity.Goods;
import com.sample.order.service.OrderService;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order")
@RestController
public class OrderController {

    @DubboReference
    private GoodsService goodsService;

    @Autowired
    OrderService orderService;

    @GetMapping("/create")
    public String createOrder() {
        orderService.createOrder();
        return "下单成功";
    }

    @GetMapping("/info")
    public Goods orderInfo() {

        return goodsService.getGoods("123");
    }
}
