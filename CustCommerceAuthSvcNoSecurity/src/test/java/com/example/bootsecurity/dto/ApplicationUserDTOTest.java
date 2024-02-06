package com.example.bootsecurity.dto;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Example")
public class ApplicationUserDTOTest {
	@BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }
 
    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }
	@AfterAll
	public static void cleanup() {
		System.out.println("@@@@@@@@ cleanup() @@@@@@");
	}
	
	
	@AfterEach
	public void cleanupAfterEach() {
		System.out.println("@@@@@@@@ cleanupAfterEach() @@@@@@");
	}
	@Test
    @DisplayName("First test")
    void firstTest() {
        System.out.println("First test method");
    }
 
    @Test
    @DisplayName("Second test")
    void secondTest() {
        System.out.println("Second test method");
    }
}
