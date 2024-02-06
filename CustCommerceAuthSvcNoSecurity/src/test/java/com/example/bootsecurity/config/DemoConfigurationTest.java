package com.example.bootsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.bootsecurity.service.AppUserService;
import com.example.bootsecurity.service.TestAppUserServiceImpl;

@Configuration
@Profile("test")
public class DemoConfigurationTest {
	//@Bean
	public AppUserService getService() {
		return new TestAppUserServiceImpl();
	}

}