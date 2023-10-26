package com.xworkz.test.driver;

import com.xworkz.test.things.Coffee;

public class CoffeeRunner {
	public static void main(String[] args) {
		Coffee coffee=new Coffee();
		
		coffee.setBranchName("malnadCafee");
		coffee.setFlavours("vanilla");
		coffee.setPlace("kodagu");
		coffee.setPrice(45);
		coffee.setQuantity(5);
		
		String name=coffee.getBranchName();
	System.out.println(name);
	String flavours=coffee.getFlavours();
	System.out.println(flavours);
	String place=coffee.getPlace();
	System.out.println(place);
	int price=coffee.getPrice();
	System.out.println(price);
	int quantity=coffee.getQuantity();
	System.out.println(quantity);
	}

}
