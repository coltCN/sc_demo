package com.sample.goods.service;

import com.sample.common.event.OrderEvent;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RocketMQMessageListener(consumerGroup = "my-group", topic = "Order_topic")
public class OrderEventService implements RocketMQListener<OrderEvent> {

    @Override
    public void onMessage(OrderEvent message) {
        log.info("收到消息：商品列表数量：{}", message.getGoodsList().size());

    }

}
