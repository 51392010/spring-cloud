package com.xin.jump.feign;

import com.xin.jump.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wangxin
 * @description 定义fallbackFactory测试Feign回退效果
 * @date Created in 2018/11/27 21:29
 */
@FeignClient(name = "microservice-provider-user", fallbackFactory = FeignClientFallbackFactory.class)
public interface UserFeignClient {

    @GetMapping(value = "/{id}")
    User findById(@PathVariable("id") String id);
}
