package com.xin.jump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class MicroserviceGatewayZuulFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceGatewayZuulFilterApplication.class, args);
	}
}
