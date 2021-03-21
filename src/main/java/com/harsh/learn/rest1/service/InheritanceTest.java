package com.harsh.learn.rest1.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.stereotype.Component;

import com.harsh.learn.rest1.entity.AbstractPlayer;
import com.harsh.learn.rest1.repository.AbstractPlayerRepository;

@Component
public class InheritanceTest {
	
	
	@Autowired
	AbstractPlayerRepository absPlayerRepo;
	
	@Autowired
	private Environment environment;
	
	
	public void showWhatweHave() {
		
		boolean activeProfilerIndicator = environment.acceptsProfiles(Profiles.of("team","!player"));
		
		System.out.println("Value of activeProfilerIndicator " + activeProfilerIndicator );
		String[] activeProfiles = environment.getActiveProfiles();

		Arrays.stream(activeProfiles).forEach(x ->  System.out.println("Active profile:" + x));
		
		System.out.println("Executing ");
		List<? extends AbstractPlayer> findAll = absPlayerRepo.findAll();
		
		findAll.
			forEach(x  -> System.out.println(x.toString()));
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		findAll.
			forEach(x  -> System.out.println(x.getDetails()));
		
		List<? extends AbstractPlayer> forId = absPlayerRepo.getForId(100);
		System.out.println("====================================");
		forId.
			forEach(x  -> System.out.println(x.getDetails()));
		
		
		
		
	
		
	}
	

}
