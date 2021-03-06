package com.xin.jump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

// 开启断路器的支持
@EnableCircuitBreaker
// Eureka客户端
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceConsumerMovieRibbonHystrixApplication {

	@Bean
	// 添加注解@LoadBalanced即可为RestTemplate整合Ribbon，使其具备负载均衡的能力
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConsumerMovieRibbonHystrixApplication.class, args);
	}
}
