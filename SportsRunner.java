package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Indoor;

public class SportsRunner {
	
	public static void main(String[] args) {
		
		Indoor i=new Indoor();
		i.setSportsName("carrom");
		i.setTotalGames(20);
		i.setTotalPlayers(2);
		i.setIndoor(true);
		
		System.out.println(i.getSportsName());
		System.out.println(i.getTotalGames());
		System.out.println(i.getTotalPlayers());
		System.out.println(i.isIndoor());
		
	}

}
