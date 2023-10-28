package com.xworkz.test.things;

public class CoffeePowder {
	
	private String powderName;
	private int price;
	private float quantity;
	
	public CoffeePowder() {
		System.out.println("no arguments constructor");
	}
	public CoffeePowder(String powderName,int price,float quantity) {
		System.out.println("all arguments constructor");
		this.powderName=powderName;
		this.price=price;
		this.quantity=quantity;
		}
	
	public void setPowderName(String powderName) {
		this.powderName=powderName;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setQuantity(float quantity) {
		this.quantity=quantity;
	}
  
	public String getPowderName() {
		return this.powderName;
	}
	public int getPrice() {
		return this.price;
	}
	public float getQuanityt() {
		return this.quantity;
	}
}
