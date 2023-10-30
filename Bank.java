package com.xworkz.test.things;

public class Bank {
	
	private String bankName;
	private String founded;
	private String manager;
	private Payment payments;
	private Account account;
	
	public Bank() {
		System.out.println("no arguments constructor");
	}
	
	public Bank(String bankName,String founded,String manager,Payment payments,Account account) {
		System.out.println("all arguments constructor");
		this.bankName=bankName;
		this.founded=founded;
		this.manager=manager;
		this.payments=payments;
		this.account=account;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
   public void setFounded(String founded) {
		this.founded = founded;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

   public void setPayments(Payment payments) {
		this.payments = payments;
	}
   public void setAccount(Account account) {
	   this.account=account;
   }
	public String getBankName() {
		return bankName;
	}
	public String getFounded() {
		return founded;
	}
	public String getManager() {
		return manager;
	}
	public Payment getPayments() {
		return payments;
	}
   public Account getAccount() {
	   return account;
   }

}
