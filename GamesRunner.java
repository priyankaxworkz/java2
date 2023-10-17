package com.xworkz.test.driver;

import com.xworkz.test.things.Games;

public class GamesRunner {
	public static void main(String[] args) {
		Games games= new Games();
		
		games.onSave("criket");
		games.onSave("kabbadi");
		games.onSave("chess");
		games.onSave("carrom");
		games.onSave("jump");
		games.onSave("lagori");
		
		games.read();
		System.out.println("it is reading");
		
		games.update("criket","highjump");
		games.read();
		System.out.println("it is updates");
		
		games.delete("highjump");
		games.read();
		System.out.println("it is deleted");
		
	}

}
