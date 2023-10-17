package com.xworkz.test.things;

public class Sweet {
	
	public String name;
	public int price;
	public String bakeryName;
	public short totalSweet;
	public double disscount;
	
	//default constructor
	
	public Sweet() {
		System.out.println("this is default constructor");
	}
	
	//paramitrised constructor
	
	public Sweet(String name,int price,String bakeryName,byte totalSweet,double disscount) {
		this.name=name;
		this.price=price;
		this.bakeryName=bakeryName;
		this.totalSweet=totalSweet;
		this.disscount=disscount;
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.bakeryName);
		System.out.println(this.totalSweet);
		System.out.println(this.disscount);
	}

}
