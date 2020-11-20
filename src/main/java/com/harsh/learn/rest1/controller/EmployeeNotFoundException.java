package com.harsh.learn.rest1.controller;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	EmployeeNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }

}
