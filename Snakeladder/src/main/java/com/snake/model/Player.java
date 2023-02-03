package com.snake.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Player {
	@Id
	private int id;
	
	private String name;
	
	private int count;
	

}
