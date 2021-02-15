package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	public ResponseEntity<Object> getDemo(){
		return new ResponseEntity<Object>("Success", HttpStatus.OK);
	}
}
