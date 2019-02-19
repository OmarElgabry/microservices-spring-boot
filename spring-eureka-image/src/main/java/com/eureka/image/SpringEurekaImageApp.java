package com.eureka.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient 	
public class SpringEurekaImageApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaImageApp.class, args);
	}
}
