package com.xworkz.test.things;

public class Payment {

	private int amount;
	private String paymentMode;
	private boolean payments;
	private Online online;

	public Payment() {
		System.out.println("no arguments constructor");
	}

	public Payment(int amount, String paymentMode, boolean payments, Online online) {
		System.out.println("all argument constructor");
		this.amount = amount;
		this.paymentMode = paymentMode;
		this.payments = payments;
		this.online = online;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public void setPayments(boolean payments) {
		this.payments = payments;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setOnline(Online online) {
		this.online =online;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public int getAmount() {
		return amount;
	}
	public boolean isPayments() {
		return payments;
	}
	public Online getOnline() {
		return online;
	}

}
