package com.example.bootsecurity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.example.bootsecurity.config.TestConfig;

@SpringBootTest
@ContextConfiguration(classes = TestConfig.class)
class SpringBootJwtSecurityApplicationTests {
	
	@Autowired
	private String hell;
	
	@Test
	void contextLoads() {
		System.out.println("running test");
	}
	
	
}
