package com.xworkz.Shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bank {
	private String bankName;
	private int totalAccounts;
	private String manager;
	private int amounts;
	
	public Bank() {
		System.out.println("this is parent class");
	}

}
