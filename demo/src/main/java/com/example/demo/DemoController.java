package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

	@GetMapping(value = "/v1/cicd")
	public ResponseEntity<Object> getDemo(){
		return new ResponseEntity<Object>("ci/cd integration success", HttpStatus.OK);
	}
}
