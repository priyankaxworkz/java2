package com.xworkz.test.driver;
import com.xworkz.test.things.Cricket;

public class CricketRunner {
	public static void main(String[] args) {
		String captainName=Cricket.captainName();
		System.out.println(captainName);
		byte totalBaller=Cricket.totalBaller();
		System.out.println(totalBaller);
		int totalBatsMan=Cricket.totalBatsMan();
		System.out.println(totalBatsMan);
		double totalOver=Cricket.totalOver();
		System.out.println(totalOver);
		short totalScore=Cricket.totalScore();
		System.out.println(totalScore);
		float scoreBit=Cricket.scoreBit();
		System.out.println(scoreBit);
		char groundSize=Cricket.groundSize();
		System.out.println(groundSize);
		long audience=Cricket.audience();
		System.out.println(audience);
		boolean win=Cricket.win();
		System.out.println(win);
	}
	

}
