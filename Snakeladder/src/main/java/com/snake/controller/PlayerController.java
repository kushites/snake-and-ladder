package com.snake.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.snake.model.Player;
import com.snake.service.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	private PlayerService playerservice;
	
	@GetMapping("/saveplayer/{no}")
	public List<Player>savePlayers(@PathVariable Integer no){
		return playerservice.savePlayers(no);
		
	}

}
