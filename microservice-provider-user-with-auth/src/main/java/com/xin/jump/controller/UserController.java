package com.xin.jump.controller;

import com.xin.jump.entity.UserEntity;
import com.xin.jump.respository.UserRespoitory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@Slf4j
@RestController
public class UserController {

    @Resource
    private UserRespoitory userRespoitory;

    @GetMapping("/{id}")
    public UserEntity findOne(@PathVariable Long id) {

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            UserDetails user = (UserDetails) principal;
            Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
            for (GrantedAuthority authority : authorities) {
                // 打印当前登陆用户的信息
                log.info("当前用户是{}，角色是{}", user.getUsername(), authority.getAuthority());
            }
        } else {
            // do other things
        }
        return userRespoitory.findOne(id);
    }

}
