package com.example.bootsecurity.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties.Http;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.apache.hc.core5.http.HttpStatus;

import com.example.bootsecurity.config.TestConfig;

@SpringBootTest
@ContextConfiguration(classes = TestConfig.class)
@AutoConfigureMockMvc
public class AdminControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getAdmin_SUCCESS() throws Exception {
		mockMvc.perform(get("/api/v1/admin")).
				 andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON));
		/*
		 * mockMvc.perform(get("/form"))
		 *     .andExpectAll(
		 *         status().isOk(),
		 *         content().contentType("text/html"),
		 *         forwardedUrl("/WEB-INF/layouts/main.jsp")
		 *
		 */
	}
}
