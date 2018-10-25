package com.xin.jump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceProviderUserAuthenticatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderUserAuthenticatingApplication.class, args);
	}
}
