package com.sample.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RefreshScope
@RequestMapping("/config")
@RestController
@Slf4j
public class ConfigController {

    @Value("${user:colt}")
    private String user;

    @GetMapping("/")
    public String index() {
        log.info("get user config:{}", user);

        return user;
    }

}
