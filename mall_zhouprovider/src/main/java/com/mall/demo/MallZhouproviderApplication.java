package com.mall.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MallZhouproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallZhouproviderApplication.class, args);
	}

}
