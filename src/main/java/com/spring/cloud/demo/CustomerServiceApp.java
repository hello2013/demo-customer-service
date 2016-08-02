package com.spring.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@EnableDiscoveryClient
@Configuration
@EnableAutoConfiguration
@ComponentScan(value = "com.spring.cloud.demo")
public class CustomerServiceApp {
	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApp.class, args);
		
	}
}
