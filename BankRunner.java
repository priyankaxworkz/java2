package com.xworkz.test.driver;

import com.xworkz.test.things.Account;
import com.xworkz.test.things.Bank;
import com.xworkz.test.things.FD;
import com.xworkz.test.things.Online;
import com.xworkz.test.things.Payment;
import com.xworkz.test.things.RD;

public class BankRunner {
	
	public static void main(String[] args) {
		Online online=new Online();
		online.setAmount(5000);
		online.setNameOfApp("phone pay");
		online.setPayment(true);
		
	    Payment payment=new Payment();
		payment.setAmount(50000);
		payment.setPaymentMode("online pay");
		payment.setPayments(true);
	    payment.setOnline(online);
	    
	    FD fd=new FD();
	    fd.setName("gfy");
	    fd.setAmount(1000);
	    fd.setPeriods((short)5);
	    
	    RD rd=new RD();
	    rd.setRdNumber(456373);
	    rd.setPeriods(5);
	    rd.setStartDate("22 dec");
	    
		
		Account account=new Account();
		account.setAccountName("personal");
		account.setAccountNumber(6789544321l);
		account.setAmount(50000);
		account.setFd(fd);
		account.setRd(rd);
		
		Bank bank=new Bank();
		bank.setBankName("canara");
		bank.setFounded("23dec");
		bank.setManager("vvv");
		bank.setPayments(payment);
		bank.setAccount(account);
		
		
	/*	System.out.println(bank.getBankName());
		System.out.println(bank.getFounded());
		System.out.println(bank.getManager());
		System.out.println(bank.getAccount().getAccountName());
		System.out.println(bank.getAccount().getAccountNumber());
		System.out.println(bank.getAccount().getAmount());
		System.out.println(bank.getAccount().getfd());
		System.out.println(bank.getAccount().getrd());
	    System.out.println(bank.getPayments().getAmount());
	    System.out.println(bank.getPayments().getPaymentMode());
	    System.out.println(bank.getPayments().isPayments());*/
		
		System.out.println(bank.getPayments().getOnline().getAmount());
		System.out.println(bank.getPayments().getOnline().getNameOfApp());
		System.out.println(bank.getPayments().getOnline().isPayment());
		
		System.out.println(bank.getAccount().getfd().getName());
		System.out.println(bank.getAccount().getfd().getAmount());
		System.out.println(bank.getAccount().getfd().getPeriods());
		
		System.out.println(bank.getAccount().getrd().getRdNumber());
		System.out.println(bank.getAccount().getrd().getPeriods());
		System.out.println(bank.getAccount().getrd().getStartDate());
	    }

}
