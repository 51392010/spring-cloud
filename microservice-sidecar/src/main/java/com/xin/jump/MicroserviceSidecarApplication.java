package com.xin.jump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 * @author wangxin
 * @version 1.0
 * @description
 * @date Created in 2018/12/8 10:35
 * @see com.xin.jump
 */
@EnableSidecar
@SpringBootApplication
public class MicroserviceSidecarApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSidecarApplication.class, args);
    }

}