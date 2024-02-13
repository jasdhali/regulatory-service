package com.example.nano;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomCommerceProductClassificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomCommerceProductClassificationApplication.class, args);
	}

}
