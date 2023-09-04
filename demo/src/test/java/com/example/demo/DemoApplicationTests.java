package com.example.demo;




import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;


//@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	DemoController controller;

	@Test
	public void contextLoads() throws JsonMappingException, JsonProcessingException {
		System.out.println("------------------------"+"Testcase 1");
		
	}
	@Test
	public void contextLoads1() {
		System.out.println("------------------------"+"Testcase 2");
	}
	
	@Test
	public void contextLoads2() {
		System.out.println("------------------------"+"Testcase 3");
	}

}
