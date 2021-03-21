package com.harsh.learn.rest1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@IdClass(TeamScenarioId.class)
public class TeamScenario extends AbstractPlayer {

	@Id
    private Integer saId;
	
	@Id
	Integer playerId;

	@Override
	public String getDetails() {
		return String.format("Scenario id %d --> Player %d , code  == %s with skill %s and strength %s ", saId, playerId, this.codeName, this.fightSkill, this.strength);
	}
	

}
