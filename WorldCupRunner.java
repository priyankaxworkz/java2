package com.xworkz.test.driver;

import java.util.Date;

import com.xworkz.test.things.WorldCup;

public class WorldCupRunner {
	public static void main(String[] args) {
		
		WorldCup worldCup=new WorldCup();
		
		System.out.println(worldCup.numberOfTeams);
		System.out.println(worldCup.date.getDate());
		System.out.println(worldCup.numberOfMatch);
		System.out.println(worldCup.hostName);
		
		
		// by using reference way
		
		int numberOfTeams=worldCup.numberOfTeams=10;
		System.out.println("number of teams is:"+numberOfTeams);
		
		Date date=worldCup.date=new Date();
		System.out.println("date is:"+date);
		
		int numberOfMatch=worldCup.numberOfMatch=7;
		System.out.println("number of match is:"+numberOfMatch);
		
		String hostName=worldCup.hostName="xxx";
		System.out.println("host name is:"+hostName);
	}

}
