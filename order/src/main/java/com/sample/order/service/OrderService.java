package com.sample.order.service;

import java.util.ArrayList;
import java.util.List;

import com.sample.common.entity.Goods;
import com.sample.common.event.OrderEvent;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class OrderService {

    @Autowired
    RocketMQTemplate mqTemplate;

    public void createOrder() {
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods("1", "鼠标", 2));
        goodsList.add(new Goods("2", "键盘", 1));
        OrderEvent event = new OrderEvent();
        event.setGoodsList(goodsList);
        // 发送库存扣减信息
        mqTemplate.send("Order_topic", MessageBuilder.withPayload(event).build());
        log.info("消息发送完成，订单创建完成");

    }
}
