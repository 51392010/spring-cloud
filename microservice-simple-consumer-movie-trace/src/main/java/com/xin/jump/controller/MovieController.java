package com.xin.jump.controller;

import com.xin.jump.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class MovieController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/user/{id}")
    public User findById(@PathVariable String id) {

        return this.restTemplate.getForObject("http://localhost:8000/" + id, User.class);
    }
}
