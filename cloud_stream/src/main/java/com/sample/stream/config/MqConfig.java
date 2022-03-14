package com.sample.stream.config;

import java.util.function.Consumer;

import com.sample.common.event.OrderEvent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class MqConfig {

    @Bean
    Consumer<OrderEvent> orderConsumer() {
        return order -> {
            log.info("stream 接收到消息，item数量：{}", order.getGoodsList().size());
        };
    }

}
