package com.example.bootsecurity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bootsecurity.dto.AppUserDTO;
import com.example.bootsecurity.model.ApplicationUser;
import com.example.bootsecurity.reposiroty.AppuserRepository;

@Service
public class AppUserServiceImpl implements AppUserService {
	@Autowired
	private AppuserRepository appuserRepository;
	
	@Override
	public ApplicationUser createUser(AppUserDTO appUserDTO) {
		return appuserRepository.save(AppUserDTO.to(appUserDTO));
	}
	
	@Override
	public ApplicationUser putUser(AppUserDTO appUserDTO,long id) {
		Optional<ApplicationUser> user =  appuserRepository.findById(id);
		ApplicationUser applicationUser = user.get();
		
		applicationUser.setFirstName(appUserDTO.getFirstName());
		applicationUser.setSecondName(appUserDTO.getSecondName());
		applicationUser.setEmail(appUserDTO.getEmail());
		applicationUser.setPassword(applicationUser.getPassword());
		applicationUser.setPasswordStr(applicationUser.getPasswordStr());
		applicationUser.setRole(applicationUser.getRole());		
		//ApplicationUser applicationUser = AppUserDTO.to(appUserDTO);
		return appuserRepository.save(applicationUser);
	}
	
	@Override
	public ApplicationUser patchUser(AppUserDTO appUserDTO,long id) {
		Optional<ApplicationUser> user =  appuserRepository.findById(id);
		ApplicationUser applicationUser = user.get();
		
		if(appUserDTO.getFirstName()!=null)	applicationUser.setFirstName(appUserDTO.getFirstName());
		if(appUserDTO.getSecondName()!=null) applicationUser.setSecondName(appUserDTO.getSecondName());
		if(appUserDTO.getEmail()!=null) applicationUser.setEmail(appUserDTO.getEmail());
		if(applicationUser.getPassword()!=null) applicationUser.setPassword(applicationUser.getPassword());
		if(applicationUser.getPasswordStr()!=null) applicationUser.setPasswordStr(applicationUser.getPasswordStr());
		if(applicationUser.getRole()!=null) applicationUser.setRole(applicationUser.getRole());		
		//ApplicationUser applicationUser = AppUserDTO.to(appUserDTO);
		return appuserRepository.save(applicationUser);
	}
	
	
	@Override
	public ApplicationUser findUser(long userId) {
		Optional<ApplicationUser> optional = appuserRepository.findById(userId); 
		return optional.get();
	}
	
}
