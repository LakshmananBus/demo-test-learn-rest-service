package com.example.demo;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@ConfigurationProperties(prefix = "acme")
@Validated
@RestController

public class DemoController {
	
	
	private final Map<String, String> testmap = new HashMap<>();
	
	  //@Autowired
	 // private MongoTemplate mongoTemplate;
	  
	
	
	@PostConstruct
	public void initTest() {
		String a = "";
	
	//	System.out.println("----"+mongoTemplate.getCollectionNames().size());
	}
	
	@Qualifier(value = "userList")
	@Autowired
	private List<String> user;
	
	LinkedHashMap<String, String> mapOfList;
	
	
	
	public LinkedHashMap<String, String> getMapOfList() {
		return mapOfList;
	}

	public void setMapOfList(LinkedHashMap<String, String> mapOfList) {
		this.mapOfList = mapOfList;
	}

	public Map<String, String> getTestmap() {
		return testmap;
	}

	@Value("#{${json.obj}}")
	private JSONObject propertyJsonObject;

	@GetMapping(value = "/v1/pathv/{org}")
	public ResponseEntity<Object> getDemo( @PathVariable 
			@Size(max = 2, min = 1, message = "path should 1 t0 2") 
			String org,
			@NotEmpty(message = "param not empty should 1 t0 2") 
			@Size(max = 2, min = 1, message = "param should 1 t0 2")
			@RequestParam(value = "sys") String sys) throws JsonMappingException, JsonProcessingException{	
		
	
		
		//mapOfList.entrySet().stream().map(p -> p.getKey()).forEach(p ->{
		/*
		 * List<Test> temp= new ObjectMapper().readValue(l, new
		 * TypeReference<List<Test>>(){}); System.out.println(temp.get(1).getValue());
		 */
		//});
		
		return new ResponseEntity<Object>(mapOfList, HttpStatus.OK);
	}
	
	@GetMapping(value = "/v1/users")
	public ResponseEntity<Object> getUsers(){	
		
	
		
		return new ResponseEntity<Object>(propertyJsonObject, HttpStatus.OK);
	}
	
	@GetMapping(value = "/v1/user/login/time")
	public ResponseEntity<Object> getTime(){				
		return new ResponseEntity<Object>(LocalDateTime.now(), HttpStatus.OK);
	}
}
