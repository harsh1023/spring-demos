package com.harsh.learn.rest1.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.harsh.learn.rest1.entity.AbstractPlayer;

@NoRepositoryBean
public interface AbstractPlayerRepository<T extends AbstractPlayer, ID  extends Serializable> extends JpaRepository<T,ID> {
	
	
	List<? extends AbstractPlayer> getForId(Integer id);

}
