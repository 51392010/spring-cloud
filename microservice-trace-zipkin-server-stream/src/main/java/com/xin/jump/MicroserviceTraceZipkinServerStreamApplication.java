package com.xin.jump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class MicroserviceTraceZipkinServerStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceTraceZipkinServerStreamApplication.class, args);
	}

}
