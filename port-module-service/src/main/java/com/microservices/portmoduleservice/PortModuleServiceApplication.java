package com.microservices.portmoduleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.microservices.portmoduleservice")
public class PortModuleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortModuleServiceApplication.class, args);
	}

}
