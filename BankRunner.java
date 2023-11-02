package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Account;

public class BankRunner {
	
public static void main(String[] args) {
	
	Account a=new Account();
	
	a.setBankName("canara");
	a.setTotalAccounts(2);
	a.setManager("dd");
	a.setAmounts(5000);
	
	System.out.println(a.getBankName());
	System.out.println(a.getTotalAccounts());
	System.out.println(a.getManager());
	System.out.println(a.getAmounts());
}

}
