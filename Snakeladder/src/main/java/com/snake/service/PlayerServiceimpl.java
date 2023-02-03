package com.snake.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.snake.model.Player;
import com.snake.repo.Playerdao;

public class PlayerServiceimpl implements PlayerService{

	@Autowired
	private Playerdao playerdao;
	
	@Override
	public Player getPlayer(int id) {
		Optional<Player>opt = playerdao.findById(id);
		return opt.get();
	}

	@Override
	public int increaseCount(int id, int c) {
		Optional<Player>opt = playerdao.findById(id);
		
		if(opt.get().getCount()+c<100) {
			opt.get().setCount(opt.get().getCount()+c);
			return opt.get().getCount();
		}
		else {
			return opt.get().getCount();
		}
		
	}

}
