package com.harsh.learn.rest1.configure;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import com.harsh.learn.rest1.entity.Employee;
import com.harsh.learn.rest1.repository.EmployeeRepository;
import com.harsh.learn.rest1.service.InheritanceTest;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {

	@Bean
	@Order(value  = 10)
	  CommandLineRunner initDatabase(EmployeeRepository repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
	      log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
	      log.info("Preloading " + repository.save(new Employee("HARSH", "thief")));
	      log.info("Preloading " + repository.save(new Employee("SONAL", "thief")));
	      log.info("Preloading " + repository.save(new Employee("HARSH", "nothing")));
	    };
	  }
	
	
	@Bean
	@Order(value  = 15)
	  CommandLineRunner callShowMe(InheritanceTest inheritTest) {

	    return args -> {
	     
	    	inheritTest.showWhatweHave();
	    };
	  }
	
	
	
}
