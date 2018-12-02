package com.xin.jump.feign;

import feign.Feign;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author wangxin
 * @version 1.0
 * @description 为Feign禁用Hystrix
 * @date Created in 2018/11/28 19:58
 * @see com.xin.jump.feign
 */
@SpringBootConfiguration
public class FeignDisableHystrixConfiguration {

    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }
}
