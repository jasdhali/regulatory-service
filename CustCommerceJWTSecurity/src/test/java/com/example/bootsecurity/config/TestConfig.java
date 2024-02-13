package com.example.bootsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

	@Bean
	public String stringBean() {
		return "hello";
	}
}