package com.harsh.learn.rest1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Player extends AbstractPlayer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	
	@Override
	public String getDetails() {
		return String.format(" Player -id  %d , code  == %s with skill %s and strength %s ",  this.id, this.codeName, this.fightSkill, this.strength);
	}
	
	
	
}
