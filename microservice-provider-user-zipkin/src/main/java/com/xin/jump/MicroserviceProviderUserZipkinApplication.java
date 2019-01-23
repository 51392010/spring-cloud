package com.xin.jump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceProviderUserZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderUserZipkinApplication.class, args);
	}

}

