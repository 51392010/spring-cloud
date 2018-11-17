package com.xin.jump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceConsumerMovieFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConsumerMovieFeignApplication.class, args);
	}
}
