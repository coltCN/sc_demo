package com.sample.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Goods {

    private String id;
    private String name;
    private Integer qty;
}
