package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicrocervisesProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicrocervisesProject2Application.class, args);
	}

}
