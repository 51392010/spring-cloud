package com.xin.jump.controller;

import com.xin.jump.entity.UserEntity;
import com.xin.jump.respository.UserRespoitory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserRespoitory userRespoitory;

    @GetMapping("/{id}")
    public UserEntity findOne(@PathVariable Long id) {

        return userRespoitory.findOne(id);
    }

}
