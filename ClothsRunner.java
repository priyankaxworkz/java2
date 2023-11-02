package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Cloths;

public class ClothsRunner {
	
	public static void main(String[] args) {
		Cloths cloths=new Cloths();
		
		cloths.setNameOfCloth("silk");
		cloths.setPrice(450);
		cloths.setLength(2.8f);
		cloths.setSize('m');
		
		String name=cloths.getNameOfCloth();
		System.out.println(name);
		
		int price=cloths.getPrice();
		System.out.println(price);
		
		float length=cloths.getLength();
		System.out.println(length);
		
		char size=cloths.getSize();
		System.out.println(size);
	}
	
	
	
}
