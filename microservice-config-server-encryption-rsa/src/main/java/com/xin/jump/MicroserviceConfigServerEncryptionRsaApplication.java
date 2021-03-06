package com.xin.jump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroserviceConfigServerEncryptionRsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConfigServerEncryptionRsaApplication.class, args);
	}

}

