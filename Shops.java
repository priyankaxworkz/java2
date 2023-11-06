package com.xworkz.test.things;

public class Shops {
	
	public void getName() {
		//this.getNames();
		System.out.println("this is no args constructor");
	}
	
	//public void getNames(int price) {
		//this.getNames();
	//	System.out.println("this is 1 args constructor");
	//}
    
	public void getNames(String... clothName) {
		for(int i=0;i<clothName.length;i++) {
			System.out.println(clothName[i]);
			}
	//public static void getPrice() {
		//System.out.println("this is get price method");
	//	}
}
}
