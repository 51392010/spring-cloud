package com.xin.jump.controller;

import com.xin.jump.entity.UserEntity;
import com.xin.jump.respository.UserRespoitory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserRespoitory userRespoitory;

    @GetMapping("/{id}")
    public UserEntity findOne(@PathVariable Long id) {
        return userRespoitory.findOne(id);
    }

    @GetMapping("/get")
    public UserEntity get0(UserEntity userEntity) {
        return userRespoitory.findOne(userEntity.getId());
    }

    @PostMapping("/post")
    public UserEntity post0(@RequestBody UserEntity userEntity) {
        return userRespoitory.findOne(userEntity.getId());
    }

}
