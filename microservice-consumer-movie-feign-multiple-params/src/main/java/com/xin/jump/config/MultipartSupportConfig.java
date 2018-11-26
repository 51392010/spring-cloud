package com.xin.jump.config;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author wangxin
 * @version 1.0
 * @description 文件上传配置类
 * @date Created in 2018/11/26 22:09
 * @see com.xin.jump.config
 */
@SpringBootConfiguration
public class MultipartSupportConfig {

    @Bean
    public Encoder feignFormEncoder() {
        return new SpringFormEncoder();
    }
}
