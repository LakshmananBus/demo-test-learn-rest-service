package com.example.demo;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class AuthManager implements AuthenticationManager{

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		System.out.println("--------------MANAGER----------");
		//System.out.println(authentication.getCredentials());
		return authentication;
	}

}
