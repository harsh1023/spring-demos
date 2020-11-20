package com.harsh.learn.rest1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Autowired
	private DummyComp dummyComp;
	
	
	@RequestMapping("/")
	public String index() {
		System.out.println("Invoking rest serivce !!! ");
		String random  =  dummyComp.getRandom();
		return "Greetings from Spring Boot " + random + "!";
	}

}