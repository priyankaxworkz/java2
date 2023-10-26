package com.xworkz.test.driver;

import com.xworkz.test.things.Dish;

public class DishRunner {
	
	public static void main(String[] args) {
		
Dish dish=new Dish();
 
	dish.setDishName("dvc");
	dish.setType((byte)6);
	dish.setPrice(456);
	dish.setQuantity((byte)23);
	dish.setPlace("uk");
	
	String name=dish.getDishName();
	System.out.println(name);
	
	byte type=dish.getType();
	System.out.println(type);
	int price=dish.getPrice();
	System.out.println(price);
	
	byte quantity=dish.getQuantity();
	System.out.println(quantity);
	
	String place=dish.getPlace();
	System.out.println(place);
	}

}
