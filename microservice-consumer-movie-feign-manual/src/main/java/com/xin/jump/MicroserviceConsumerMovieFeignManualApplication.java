package com.xin.jump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceConsumerMovieFeignManualApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConsumerMovieFeignManualApplication.class, args);
	}
}
