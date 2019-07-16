package com.mall.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MallEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallEurekaserverApplication.class, args);
	}

}
