package com.example.bootsecurity.controller;

import static com.example.bootsecurity.util.ResponseUtil.buildFailedResponse;
import static com.example.bootsecurity.util.ResponseUtil.buildSuccessResponse;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.bootsecurity.config.ResponseSchema;
import com.example.bootsecurity.dto.AppUserDTO;
import com.example.bootsecurity.exception.ResourceNotFoundException;
import com.example.bootsecurity.model.ApplicationUser;
import com.example.bootsecurity.reposiroty.AppuserRepository;
import com.example.bootsecurity.service.AppUserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

	@Autowired
	private AppuserRepository appuserRepository;

	@Autowired
	private AppUserService appUserService;

	@GetMapping("/users")
	public ResponseEntity<ResponseSchema<List<ApplicationUser>>> users() {
		List<ApplicationUser> users =  appuserRepository.findAll();
		return new ResponseEntity<>(buildSuccessResponse(users, new ResponseSchema<List<ApplicationUser>>()), HttpStatus.OK);
	}

	@GetMapping("/users/{id}")
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ResponseSchema<ApplicationUser>> users(@PathVariable(name = "id") long userId) {
		ApplicationUser user = appuserRepository.findById(userId).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found with id " + userId));
		return new ResponseEntity<>(buildSuccessResponse(user, new ResponseSchema<ApplicationUser>()), HttpStatus.OK);

	}

	@GetMapping("/findusers/{id}")
	// @ExceptionHandler(NoSuchElementFoundException.class)
	public ResponseEntity<ResponseSchema<ApplicationUser>> finduser(@PathVariable(name = "id") long userId) {
		return new ResponseEntity<>(
				buildSuccessResponse(appUserService.findUser(userId), new ResponseSchema<ApplicationUser>()),
				HttpStatus.OK);

	}

	@PostMapping("/signup")
	public ResponseEntity<ApplicationUser> signUp(@RequestBody @Valid AppUserDTO appUserDTO) {
		return new ResponseEntity(appUserService.createUser(appUserDTO), HttpStatus.OK);
	}

	@PutMapping("/alteruser/{id}")
	public ResponseEntity<ApplicationUser> updateAll(@RequestBody @Valid AppUserDTO appUserDTO,@PathVariable("id") long id) {
		return new ResponseEntity(appUserService.putUser(appUserDTO,id), HttpStatus.OK);
	}
	@PatchMapping("/alteruser/{id}")
	public ResponseEntity<ApplicationUser> patchUser(@RequestBody @Valid AppUserDTO appUserDTO,@PathVariable("id") long id) {
		return new ResponseEntity(appUserService.patchUser(appUserDTO,id), HttpStatus.OK);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

	@ExceptionHandler(NoSuchElementException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ResponseEntity<ResponseSchema<String>> handleNoSuchElementFoundException(NoSuchElementException exception) {
		// return
		// ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
		return new ResponseEntity<>(
				buildFailedResponse("Queried data not found", exception.getMessage(), new ResponseSchema<String>()),
				HttpStatus.NOT_FOUND);

	}

}