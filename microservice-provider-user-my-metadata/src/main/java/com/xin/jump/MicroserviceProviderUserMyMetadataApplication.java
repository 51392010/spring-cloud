package com.xin.jump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceProviderUserMyMetadataApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderUserMyMetadataApplication.class, args);
	}
}
