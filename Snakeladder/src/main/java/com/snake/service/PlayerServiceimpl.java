package com.snake.service;

import java.util.ArrayList;
import java.util.List;
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

	@Override
	public List<Player> savePlayers(int n) {
		List<Player>players =new ArrayList<>();
		if(n==3) {
			Player p1= new Player(1,"Player1",0);
			Player p2= new Player(1,"Player2",0);
			Player p3= new Player(1,"Player3",0);
			players.add(p1);
			players.add(p2);
			players.add(p3);
			playerdao.saveAll(players);
			
		}
		else if(n==2) {
			Player p1= new Player(1,"Player1",0);
			Player p2= new Player(1,"Player2",0);
			players.add(p1);
			players.add(p2);
			playerdao.saveAll(players);
		}
		else if(n==1) {
			Player p1= new Player(1,"Player1",0);
			
			players.add(p1);
			playerdao.saveAll(players);
		}
		
		
		return players;
	}

}
