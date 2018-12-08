package com.xin.jump.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class SidecarClientController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String findById() {
        // 将会请求到：http://localhost:8060/，返回结果：{"index":"欢迎来到首页"}
        return this.restTemplate.getForObject("http://microservice-sidecar-node-service/", String.class);
    }

}
