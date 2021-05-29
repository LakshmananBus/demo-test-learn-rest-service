package com.example.demo;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.stereotype.Component;

@Component
public class BasicAuthFilter extends BasicAuthenticationFilter{

	public BasicAuthFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
		// TODO Auto-generated constructor stub
	}
	
	 @Override
	  protected void doFilterInternal(
	      HttpServletRequest request, HttpServletResponse response, FilterChain chain)
	      throws IOException, ServletException {
			System.out.println("--------------FILTER----------");
	    String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);


	      UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
	          new UsernamePasswordAuthenticationToken(authHeader, authHeader);

	      Authentication auth =
	          this.getAuthenticationManager().authenticate(usernamePasswordAuthenticationToken);
	      SecurityContextHolder.getContext().setAuthentication(auth);

	      chain.doFilter(request, response);
	    }

}
