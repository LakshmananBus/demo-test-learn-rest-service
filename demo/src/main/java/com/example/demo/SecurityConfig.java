package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	AuthManager authManager;

  /** 
   * @param http
   * @throws Exception
   */
  @Override
  protected void configure(HttpSecurity http) throws Exception {
	  System.out.println("--------------CONFIG----------");
    http.authorizeRequests().antMatchers("/**").authenticated().and().httpBasic();
    http.csrf().disable();
    http.headers().frameOptions().disable();
  //  http.addFilter(new BasicAuthFilter(authManager));
  }

}
