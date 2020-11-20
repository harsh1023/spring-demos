package com.harsh.learn.rest1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harsh.learn.rest1.entity.Employee;
import com.harsh.learn.rest1.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	private final EmployeeRepository repository;
	
	EmployeeController(EmployeeRepository repository) {
	    this.repository = repository;
	  }
	
	 @GetMapping("/employees")
	  List<Employee> all() {
	    return repository.findAll();
	  }

	  @PostMapping("/employees")
	  Employee newEmployee(@RequestBody Employee newEmployee) {
	    return repository.save(newEmployee);
	  }

	  // Single item

	  @GetMapping("/employees/{id}")
	  Employee one(@PathVariable Long id) {

	    return repository.findById(id)
	      .orElseThrow(() -> new EmployeeNotFoundException(id));
	  }
	  
	  @PutMapping("/employees/{id}")
	  Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

	    return repository.findById(id)
	      .map(employee -> {
	        employee.setName(newEmployee.getName());
	        employee.setRole(newEmployee.getRole());
	        return repository.save(employee);
	      })
	      .orElseGet(() -> {
	        newEmployee.setId(id);
	        return repository.save(newEmployee);
	      });
	  }

	  @DeleteMapping("/employees/{id}")
	  void deleteEmployee(@PathVariable Long id) {
	    repository.deleteById(id);
	  }
	  
	  @GetMapping("/employees2")
	  List<Employee> findByName(@RequestParam(name = "name") String name) {
		  
		  return repository.findByName(name);
	  }

	  
	  
}

