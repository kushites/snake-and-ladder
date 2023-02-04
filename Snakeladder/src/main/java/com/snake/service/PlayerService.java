package com.snake.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.snake.model.Player;
import com.snake.repo.Playerdao;

public interface PlayerService {
	
	public Player getPlayer(int id);
	
	public List<Player> savePlayers(int n);
	
	public int increaseCount(int id, int c);
	

}
