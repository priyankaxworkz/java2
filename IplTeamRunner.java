package com.xworkz.test.driver;

import com.xworkz.test.things.IplTeam;

public class IplTeamRunner {

	public static void main(String[] args) {
		
		IplTeam iplTeam=new IplTeam();
		
		iplTeam.getTeamName("rcb");
		iplTeam.getTeamName("csk");
		iplTeam.getTeamName("punjab");
		System.out.println("it is save");
		
		iplTeam.read();
		System.out.println("it is readed");
		
		iplTeam.update("punjab","mi");
		iplTeam.read();
		System.out.println("it is updated");

	iplTeam.delete("csk");
	iplTeam.read();
	System.out.println("it is deleted");
	}
}
