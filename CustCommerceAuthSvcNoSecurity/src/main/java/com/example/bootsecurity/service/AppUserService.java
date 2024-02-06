package com.example.bootsecurity.service;

import com.example.bootsecurity.dto.AppUserDTO;
import com.example.bootsecurity.model.ApplicationUser;

public interface AppUserService {

	ApplicationUser createUser(AppUserDTO appUserDTO);

	ApplicationUser putUser(AppUserDTO appUserDTO, long id);

	ApplicationUser patchUser(AppUserDTO appUserDTO, long id);

	ApplicationUser findUser(long userId);

}