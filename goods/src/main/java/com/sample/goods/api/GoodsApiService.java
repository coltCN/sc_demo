package com.sample.goods.api;

import com.sample.api.service.GoodsService;
import com.sample.common.entity.Goods;

import org.apache.dubbo.config.annotation.DubboService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@DubboService(protocol = "dubbo")
public class GoodsApiService implements GoodsService {

    @Override
    public Goods getGoods(String id) {
        log.info("查询货物信息：{}", id);

        return new Goods(id, "键盘", 1);
    }

}
