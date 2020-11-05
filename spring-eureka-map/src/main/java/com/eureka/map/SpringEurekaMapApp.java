package com.eureka.map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient 
public class SpringEurekaMapApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaMapApp.class, args);
	}

}
