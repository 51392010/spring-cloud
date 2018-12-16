package com.xin.jump.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxin
 * @version 1.0
 * @description
 * @date Created in 2018/12/16 17:41
 * @see com.xin.jump.controller
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${spring.cloud.config.profile}")
    private String profile;

    @GetMapping("/profile")
    public String hello() {
        return this.profile;
    }

}
