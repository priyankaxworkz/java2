package com.xworkz.test.driver;

import com.xworkz.test.things.Rain;

public class RainRunner {
	public static void main(String[] args) {
		String[] days= {"monday","tuesday"};
		boolean[] raining= {true,false};
		Rain.getDays(days, raining);
	}

}
