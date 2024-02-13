package com.example.bootsecurity.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.example.bootsecurity.model.AppUserRole;
import com.example.bootsecurity.service.UserService;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfiguration {

	private final UserService userService;
	private final JwtTokenAndAuthFilter jwtTokenFilter;
	
	@Value("${spring.custom.security.enabled}")
	private boolean securityEnbled;
	
			
	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins(Arrays.asList("http://localhost:5173/**"));
		configuration.setAllowedMethods(Arrays.asList("GET","POST"));
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}
	

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		// Enable CORS and disable CSRF
		httpSecurity.csrf(AbstractHttpConfigurer::disable);
		httpSecurity.cors(Customizer.withDefaults());
		// Authorize some urls like (swagger and signup etc)
		if(securityEnbled) {
		httpSecurity.authorizeHttpRequests(request -> request
				.requestMatchers("/v3/**", "/swagger-ui/**", "/api/v1/auth/**" ).permitAll());
		httpSecurity
				.authorizeHttpRequests(request -> request.requestMatchers(HttpMethod.GET, "**/hello/**").permitAll());
		httpSecurity.authorizeHttpRequests(
				request -> request.requestMatchers("/api/v1/admin").hasAnyAuthority(AppUserRole.ADMIN.name()));
		httpSecurity.authorizeHttpRequests(
				request -> request.requestMatchers("/api/v1/user").hasAnyAuthority(AppUserRole.USER.name()));

		// Set session to stateless.
		httpSecurity.sessionManagement(manager -> manager.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		}
		else {
			httpSecurity.authorizeHttpRequests(request -> request
					.requestMatchers("/**").permitAll());
		}
		httpSecurity.userDetailsService(userService.getUserDetailsService())
				.authenticationProvider(getDBAuthenticationProvider());
		httpSecurity.addFilterBefore(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class);
		return httpSecurity.build();
	}

	@Bean
	public AuthenticationProvider getDBAuthenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setPasswordEncoder(new BCryptPasswordEncoder());
		daoAuthenticationProvider.setUserDetailsService(userService.getUserDetailsService());
		return daoAuthenticationProvider;
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}
}
