package com.criapi.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CricRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricRegistryApplication.class, args);
	}

}
