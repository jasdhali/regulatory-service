package com.example.bootsecurity.controller;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.example.bootsecurity.config.DemoConfigurationTest;


@SpringBootTest(classes = DemoConfigurationTest.class)
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class ControllerTest {

	@Autowired
	private MockMvc mockMvc;

	//@MockBean
	//private UserController controller;

	//@Test
	public void testHelloMessage() {
		try {
			/*mockMvc.perform(get(RestEndpointConfig.REGULATORY_INTEL + RestEndpointConfig.META_DATA)
					.accept(MediaType.APPLICATION_JSON))
					.andExpect(status().isOk())
					.andExpect(jsonPath("$.status_code").exists())
					.andExpect(jsonPath("$.status_code", is(200)))
					.andExpect(jsonPath("$.message").exists())
					.andExpect(jsonPath("$.message", is("success")))
					.andExpect(jsonPath("$.data").exists()); */
			ResultActions resultActions = mockMvc.perform(get("/api/v1/user"));
			System.out.println("resultActions>>>>>" + resultActions );
			
			mockMvc.perform(get("/api/v1/user"))
			//.andExpect(status().isOk())
			//.andExpect(jsonPath("$.status_code", is(404)))
			//.andExpect(jsonPath("$.message", is("Hello User")))
			.andReturn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println( e.getMessage() );
		}
	}
}
