package com.xworkz.test.things;

public class Milk {
	
	private String milkType;
	private int price;
	private float liters;
	
	public Milk() {
		System.out.println("no arguments constructor");
	}
   public Milk(String milkType,int price,float liters) {
	   System.out.println("all arguments constructor");
	   this.milkType=milkType;
	   this.price=price;
	   this.liters=liters;
   }
   
   public void setMilkType(String milkType) {
	   this.milkType=milkType;
   }
   public void setPrice(int price) {
	   this.price=price;
   }
   public void setLiters(float liters) {
	   this.liters=liters;
   }
   
   public String getMilkType() {
	   return this.milkType;
   }
   public int getPrice() {
	   return this.price;
   }
   public float getLiters() {
	   return this.liters;
   }
}
