package com.example.bootsecurity.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.bootsecurity.reposiroty.AppuserRepository;
import com.example.bootsecurity.service.AppUserService;

//@WebMvcTest(AuthenticationController.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class AltControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private AppuserRepository repository;
	
	@MockBean
	private AppUserService userService;	
	

	@Test
	public void getAllEmployeesAPI() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/users").accept(MediaType.APPLICATION_JSON)).andDo(print())
				.andExpect(status().isOk()).andExpect(MockMvcResultMatchers.jsonPath("$.message").exists())
				.andExpect(MockMvcResultMatchers.jsonPath("$.data[*].id").isNotEmpty());
	}
}
