package com.xworkz.Shopping.things;

public class SouthFood extends Food {

	protected String name;
	protected int price;
	protected boolean isSpicy;

	public void getFoodUnfo() {
		super.foodName="talli";
		super.foodTypes=25;
		super.price=180;
	
	System.out.println("food name is:"+super.foodName);
	System.out.println("food type  is:"+super.foodTypes);
	System.out.println("food price is:"+super.price);
	}
	
}
