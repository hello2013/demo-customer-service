package com.spring.cloud.demo.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class DataProperties {
	
	@Value("${my.message}")
	private String message;

	public String getMessage() {
		System.err.println("-----------my.message="+message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	} 

}
