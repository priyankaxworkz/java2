package com.xworkz.Shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sports {
	
	private String sportsName;
	private int totalPlayers;
	private int totalGames;
	private boolean isIndoor;
	
	public Sports() {
		System.out.println("this is parent class");
	}

}
