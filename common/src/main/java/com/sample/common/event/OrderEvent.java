package com.sample.common.event;

import java.util.List;

import com.sample.common.entity.Goods;

import lombok.Data;

@Data
public class OrderEvent {
    private List<Goods> goodsList;
}
