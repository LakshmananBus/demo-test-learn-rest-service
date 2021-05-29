package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigImport {

	@Bean
	public List<String> userList2() {
		//System.out.println("import config");
		List<String> userList = new ArrayList<>();
		userList.add("by Lakshmanan");
		return userList;
	}
}
