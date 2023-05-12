package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hellocontroller {

	@GetMapping("/hello")
	public String sayhello() {
		return "Hello world";
		
	}
	@GetMapping("/bye")
	public String saybye() {
		return "Welcome To the new EC2 Instances, Thanks";
		
	}
}
