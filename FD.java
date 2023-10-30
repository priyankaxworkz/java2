package com.xworkz.test.things;

public class FD {
	
	private int amount;
	private String name;
	private short periods;
	
	public FD() {
		System.out.println("no arguments constructor");
	}
	public FD(int amount, String name, short periods) {
		System.out.println("all argument constructor");
		this.amount = amount;
		this.name = name;
		this.periods = periods;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPeriods(short periods) {
		this.periods = periods;
	}
	public int getAmount() {
		return amount;
	}
	
	public String getName() {
		return name;
	}
	
	public short getPeriods() {
		return periods;
	}
	
	
	
	

}
