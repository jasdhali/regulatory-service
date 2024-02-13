package com.javaguy.serviceregistry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class UserController {
	@GetMapping
	public String getUser() {
		return "Hello User";
	}

}
