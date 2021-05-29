package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
public class Config {
	
	@Bean
    public MethodValidationPostProcessor methodValidationPostProcessor() {
         return new MethodValidationPostProcessor();
    }

	@Bean
	public List<String> userList() {
		//System.out.println("config");
		List<String> userList = new ArrayList<>();
		userList.add("by Lakshmanan");
		return userList;
	} 
	
	@Bean
	public List<String> userList1() {
		//System.out.println("config 1");
		List<String> userList = new ArrayList<>();
		userList.add("by Lakshmanan 1");
		return userList;
	} 
	
}
