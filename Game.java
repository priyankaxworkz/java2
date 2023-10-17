package com.xworkz.test.things;

public class Game {
	public static void getGameInformation() {
		System.out.println("this is information of the game");
	}
	public static void getGameInformation(String gameName,int numberOfPlayers) {
		System.out.println("name of the game:"+gameName+ "number of players:"+numberOfPlayers);
	}
public static void getNameOfGame(String gameName){
	if(gameName=="chess") {
		System.out.println("this is Chess");
		return;
}
	
}
public static boolean indoorGame() {
	System.out.println("indoorGame");
return true;

}
}
