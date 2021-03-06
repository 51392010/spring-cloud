package com.xin.jump.feign;

import com.xin.jump.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {

    @GetMapping(value = "/{id}")
    User findById(@PathVariable("id") String id);
}
