package com.xin.jump.feign;

import com.xin.jump.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@FeignClient(name = "microservice-provider-user-multiple-params")
public interface UserFeignClient {

    @GetMapping(value = "/{id}")
    User findById(@PathVariable("id") String id);

    // 此方法不可用，虽指定GET请求，但是Feign依然会使用POST发送请求
    @GetMapping(value = "/get")
    User get0(@RequestParam("user") User user);

    @GetMapping(value = "/get")
    User get1(@RequestParam("id") Long id, @RequestParam("username") String username);

    @GetMapping(value = "/get")
    User get2(@RequestParam("map") HashMap<String, Object> map);

    @PostMapping(value = "/post")
    User post(@RequestBody User user);

}
