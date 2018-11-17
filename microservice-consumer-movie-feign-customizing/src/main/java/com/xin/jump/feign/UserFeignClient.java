package com.xin.jump.feign;

import com.xin.jump.config.FeignConfiguration;
import com.xin.jump.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author wangxin
 * @version 1.0
 * @description 使用@FeignClient的configuration属性，指定feign的配置类
 * @date 2018/11/14 22:15
 */
@FeignClient(name = "microservice-provider-user", configuration = FeignConfiguration.class)
public interface UserFeignClient {

    /**
     * @author wangxin
     * @description 使用feign自带的注解@RequestLine
     * @date 2018/11/14 22:33
     * @ses https://github.com/OpenFeign/feign
     * @params [id]
     * @return com.xin.jump.entity.User
     */
    @RequestLine(value = "GET /{id}")
    User findById(@Param("id") String id);
}
