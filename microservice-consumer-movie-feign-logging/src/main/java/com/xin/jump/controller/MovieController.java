package com.xin.jump.controller;

import com.xin.jump.entity.User;
import com.xin.jump.feign.UserFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MovieController {

    @Resource
    private UserFeignClient userFeignClient;

    @GetMapping(value = "/user/{id}")
    public User findById(@PathVariable String id) {

        return userFeignClient.findById(id);
    }
}
