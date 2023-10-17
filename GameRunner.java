package com.xworkz.test.driver;
import com.xworkz.test.things.Game;

public class GameRunner {
	public static void main(String args[]) {
		Game.getGameInformation();
		Game.getGameInformation("chess",2);
		Game.getNameOfGame("chess");
		boolean indoorGame=Game.indoorGame();
		System.out.println(indoorGame);
	}

}
