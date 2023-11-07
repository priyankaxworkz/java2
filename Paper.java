package com.xworkz.Shopping.things;

public class Paper extends Craft {
	@Override
	public void getCraftInfo() {
		System.out.println("this is  newly added paper information");
	}
	
	public void getNameOfCraft(String name) {
		System.out.println("this is name of paper");
		}
	
	public void getCraftType(byte type) {
		System.out.println("this is type of the paper");
	}

}
