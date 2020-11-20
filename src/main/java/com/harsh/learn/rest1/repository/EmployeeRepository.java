package com.harsh.learn.rest1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.learn.rest1.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	List<Employee> findByName(String name);

}
