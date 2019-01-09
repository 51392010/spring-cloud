package com.xin.jump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceConfigClientEurekaAuthenticatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConfigClientEurekaAuthenticatingApplication.class, args);
	}

}

