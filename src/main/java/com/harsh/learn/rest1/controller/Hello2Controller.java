package com.harsh.learn.rest1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harsh.learn.rest1.pojo.Greeting;

@RestController
public class Hello2Controller {

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name" ) String name) {
		return new Greeting(1, String.format("Hello %s !", name));
	}
}
