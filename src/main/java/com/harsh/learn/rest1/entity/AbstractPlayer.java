package com.harsh.learn.rest1.entity;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data
public abstract class AbstractPlayer {
	
	String codeName;
	
	String fightSkill;
	
	Integer strength;
	
	
	public abstract String getDetails() ;
	

}
