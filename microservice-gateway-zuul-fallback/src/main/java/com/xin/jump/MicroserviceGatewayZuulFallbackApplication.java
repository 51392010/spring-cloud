package com.xin.jump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class MicroserviceGatewayZuulFallbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceGatewayZuulFallbackApplication.class, args);
	}
}
