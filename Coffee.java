package com.xworkz.test.things;

public class Coffee {
	
	private String branchName;
	private String flavours;
	private int price;
	private String place;
	private int quantity;
	
	public Coffee() {
		System.out.println("this is no args");
	}
	
	public Coffee(String branchName,String flavours,int price,String place,int quantity) {
		this.branchName=branchName;
		this.flavours=flavours;
		this.price=price;
		this.place=place;
		this.quantity=quantity;
	
}
	public void setBranchName(String branchName) {
		this.branchName=branchName;
	}
	public void setFlavours(String flavours) {
		this.flavours=flavours;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setPlace(String place) {
		this.place=place;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public String getBranchName() {
		return this.branchName;
	}
	public String getFlavours() {
		return this.flavours;
	}
	public int getPrice() {
		return this.price;
	}
	public String getPlace() {
		return this.place;
	}
	public int getQuantity() {
		return this.quantity;
	}
}