package com.xworkz.test.things;

public class Account {
	
	private String accountName;
	private int amount;
	private long accountNumber;
	private RD rd;
	private FD fd;
	
	public Account() {
		System.out.println("no arguments constructor");
	}
	
	public Account( String accountName, int amount,long accountNumber,RD rd,FD fd) {
		System.out.println("all arguments constructor");
		this.accountName=accountName;
		this.amount=amount;
		this.accountNumber=accountNumber;
		this.rd=rd;
		this.fd=fd;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setRd(RD rd) {
		this.rd= rd;
	}
	public void setFd(FD fd) {
		this.fd=fd;
		}
	public String getAccountName() {
		return accountName;
	}
    public int getAmount() {
		return amount;
	}
   public long getAccountNumber() {
		return accountNumber;
	}
  public RD getrd() {
		return rd;
	}
public FD getfd() {
	return fd;
}
		

}
