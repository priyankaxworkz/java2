package com.xworkz.test.things;

public class Coffees {
	
	private Milk milk;
	private CoffeePowder coffeePowder;

	public Coffees() {
		System.out.println("no arguments constructor");
	}
	
	public Coffees(Milk milk,CoffeePowder coffeePowder) {
		System.out.println("all arguments constructor");
	this.milk=milk;
	this.coffeePowder=coffeePowder;
	}
	
	public void setMilk(Milk milk) {
		this.milk=milk;
	}
	public void setCoffeePowder(CoffeePowder coffeePowder) {
		this.coffeePowder=coffeePowder;
	}
	
	public Milk getMilk() {
		return this.milk;
	}
	public CoffeePowder getCoffeePowder() {
		return this.coffeePowder;
	}
	
}
