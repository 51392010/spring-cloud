package com.xin.jump.config;

import feign.Contract;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author wangxin
 * @version 1.0
 * @description 该类为Feign的配置类
 * 注意：该不应该在主应用程序上下文的@ComponentScan中。
 * @date 2018/11/14 22:38
 */
@SpringBootConfiguration
public class FeignConfiguration {

    /**
     * @author wangxin
     * @description 将契约改为feign原生的默认契约。这样就可以使用feign自带的注解了
     * @date 2018/11/14 22:39
     * @ses FeignConfiguration.java
     * @return feign.Contract
     */
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

}
