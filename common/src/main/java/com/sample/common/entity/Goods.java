package com.sample.common.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Goods implements Serializable {

    private String id;
    private String name;
    private Integer qty;
}
