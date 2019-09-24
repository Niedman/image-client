package com.microservices.imageclient.imageclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ImageClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageClientApplication.class, args);
	}

}
