package com.xin.jump.feign;

import com.xin.jump.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserFeignClient {

    @GetMapping(value = "/{id}")
    User findById(@PathVariable("id") Long id);
}
