package com.harsh.learn.rest1.repository;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.Query;

import com.harsh.learn.rest1.entity.TeamScenario;
import com.harsh.learn.rest1.entity.TeamScenarioId;

@Profile("team")
public interface TeamScenarioRepository extends AbstractPlayerRepository<TeamScenario, TeamScenarioId> {
	
	@Query(value = "SELECT * from TeamScenario where sa_id =?1 ", nativeQuery = true)
	List<TeamScenario> getForId(Integer id);
	//List<TeamScenario> getTeamScenariosForId(Integer saId);

}
