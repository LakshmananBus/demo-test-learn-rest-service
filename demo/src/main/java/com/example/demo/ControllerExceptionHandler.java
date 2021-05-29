package com.example.demo;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = { ConstraintViolationException.class })
    //@ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ResponseEntity<Object>  handleResourceNotFoundException(ConstraintViolationException e) {
         Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
         StringBuilder strBuilder = new StringBuilder();
         for (ConstraintViolation<?> violation : violations ) {
              strBuilder.append(violation.getMessage() + "\n");
         }
         return new ResponseEntity<Object>(strBuilder.toString(), HttpStatus.BAD_REQUEST);
    }
}
