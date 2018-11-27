package com.xin.jump.feign;

import com.xin.jump.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wangxin
 * @description Feign的fallback测试 使用@FeignClient的fallback属性指定回退类
 * @date Created in 2018/11/27 20:37
 */
@FeignClient(name = "microservice-provider-user", fallback = FeignClientFallback.class)
public interface UserFeignClient {

    @GetMapping(value = "/{id}")
    User findById(@PathVariable("id") String id);
}
