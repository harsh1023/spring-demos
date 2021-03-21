package com.harsh.learn.rest1.repository;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.Query;

import com.harsh.learn.rest1.entity.Player;

@Profile("player")
public interface PlayerRepository extends AbstractPlayerRepository<Player, Integer> {

	@Query(value = "SELECT * from Player where id =?1 ", nativeQuery = true)
	List<Player> getForId(Integer id);
}
