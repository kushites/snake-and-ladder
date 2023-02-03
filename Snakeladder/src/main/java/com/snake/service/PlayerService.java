package com.snake.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.snake.model.Player;
import com.snake.repo.Playerdao;

public interface PlayerService {
	
	public Player getPlayer(int id);
	
	public int increaseCount(int id, int c);
	

}
