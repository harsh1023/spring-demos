package com.harsh.learn.rest1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode
@NoArgsConstructor
@Data
public class Employee {

	 private @Id @GeneratedValue Long id;
	 private String name;
	 private String role;
	  
	 public Employee(String name, String role) {
		    this.name = name;
		    this.role = role;
	 }
	 

}
