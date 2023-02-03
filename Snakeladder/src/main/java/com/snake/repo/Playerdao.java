package com.snake.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snake.model.Player;

public interface Playerdao extends JpaRepository<Player, Integer>{
	

}
