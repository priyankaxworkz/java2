package com.xworkz.test.driver;

import com.xworkz.test.things.Coffees;
import com.xworkz.test.things.Milk;
import com.xworkz.test.things.CoffeePowder;

public class CoffeesRunner {
	
	public static void main(String[] args) {
		Coffees coffees=new Coffees();
	    Milk milk=new Milk();
		milk.setMilkType("nandini");
		milk.setPrice(45);
		milk.setLiters(2.0f);
		
		CoffeePowder coffeePowder=new CoffeePowder();
		coffeePowder.setPowderName("levista");
		coffeePowder.setPrice(60);
		coffeePowder.setQuantity(2.0f);
		
		coffees.setMilk(milk);
		//System.out.println(coffees.getMilk().getMilkType().getPrice().getLiters());
	    System.out.println(coffees.getMilk().getMilkType());
		System.out.println(coffees.getMilk().getPrice());
		System.out.println(coffees.getMilk().getLiters());
		coffees.setCoffeePowder(coffeePowder);
		//System.out.println(coffees.getCoffeePowder().getPowderName().getPrice().getQuantity());
		System.out.println(coffees.getCoffeePowder().getPowderName());
		System.out.println(coffees.getCoffeePowder().getPrice());
		System.out.println(coffees.getCoffeePowder().getQuanityt());
	}

}
