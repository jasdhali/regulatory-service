package com.example.bootsecurity.reposiroty;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootsecurity.model.AppUserRole;
import com.example.bootsecurity.model.ApplicationUser;

public interface AppuserRepository extends JpaRepository<ApplicationUser, Long> {
		Optional<ApplicationUser> findByEmail(String firstName);
		ApplicationUser findByRole(AppUserRole role);
}	
