package com.xworkz.test.things;

public class Online {
	
	private String nameOfApp;
	private int amount;
	private boolean payment;
	
	public Online() {
		System.out.println("no args constructor");
	}
	
	public Online(String nameOfApp,int amount,boolean payment) {
		System.out.println("all arguments constructor");
		this.nameOfApp=nameOfApp;
		this.amount=amount;
		this.payment=payment;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isPayment() {
		return payment;
	}

	public void setPayment(boolean payment) {
		this.payment = payment;
	}
	public String getNameOfApp() {
		return nameOfApp;
	}

	public void setNameOfApp(String nameOfApp) {
		this.nameOfApp = nameOfApp;
	}

	public int getAmount() {
		return amount;
	}


	

}
