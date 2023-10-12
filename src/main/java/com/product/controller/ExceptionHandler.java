package com.product.controller;
  
import org.springframework.http.HttpStatus; import
org.springframework.web.bind.annotation.ControllerAdvice; import
org.springframework.web.bind.annotation.ResponseStatus;
  
@ControllerAdvice 
public class ExceptionHandler {
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@org.springframework.web.bind.annotation.ExceptionHandler(value=Exception.class) 
	public String exceptionHandle() { 
		
		return "error"; 
		
		}  
  }
 