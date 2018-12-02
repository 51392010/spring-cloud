package com.xin.jump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@EnableTurbineStream
@SpringBootApplication
public class MicroserviceHystrixTurbineMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceHystrixTurbineMqApplication.class, args);
	}
}
