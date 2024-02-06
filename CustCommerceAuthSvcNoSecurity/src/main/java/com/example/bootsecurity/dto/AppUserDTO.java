package com.example.bootsecurity.dto;

import com.example.bootsecurity.model.AppUserRole;
import com.example.bootsecurity.model.ApplicationUser;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AppUserDTO {
	
	private String firstName;
	private String secondName;
	//@Email(message = "Please use a valid email")
	private String email;
	private String password;
	private AppUserRole role;
	
	public static AppUserDTO from(ApplicationUser user) {
		return AppUserDTO
				.builder()
				.firstName(user.getFirstName())
				.secondName( user.getSecondName())
				.password(user.getPasswordStr())
				.build();
	}
	public static ApplicationUser to(AppUserDTO userDTO) {
		return ApplicationUser				
				.builder()
				.email(userDTO.getEmail())
				.firstName(userDTO.getFirstName())
				.secondName( userDTO.getSecondName())
				//.password( passwordEncoder.encode( userDTO.getPassword() ))
				.passwordStr( userDTO.getPassword() )
				.role(userDTO.getRole())
				.build();
	}
}
