package com.xworkz.account.runner;

import com.xworkz.account.dto.AccountDto;
import com.xworkz.account.service.AccountDetailsService;
import com.xworkz.account.service.AccountDetailsServiceImpl;

public class AccountDetailsRunner {
	
	public static void main(String[] args) {
		AccountDto dto=new AccountDto();
		dto.setBankName("canaraBank");
		dto.setAccountNumber(1127456812l);
		dto.setAddress("murdeswara");
		dto.setBranchCode("bb0412");
		dto.setContactNumber(6543217896l);
		dto.setEmailId("canara@gmail.com");
		
		AccountDto dto1=new AccountDto();
		dto1.setBankName("sbi");
		dto1.setAccountNumber(1144324812l);
		dto1.setAddress("bangalore");
		dto1.setBranchCode("ss5432");
		dto1.setContactNumber(6543217656l);
		dto1.setEmailId("sbi@gmail.com");
		
		AccountDetailsService service=new AccountDetailsServiceImpl();
		service.validateDto(dto);
		service.validateDto(dto1);
		service.read();
		
		System.out.println("updated method");
		AccountDto dto2=new AccountDto();
		dto2.setBankName("canara");
		dto2.setAccountNumber(1144324812l);
		dto2.setAddress("bangalore");
		dto2.setBranchCode("ss5432");
		dto2.setContactNumber(6543217656l);
		dto2.setEmailId("sbi@gmail.com");
		
		service.update("sbi", dto);
		service.read();
		
		System.out.println("deleted method");
		AccountDto dto3=new AccountDto();
		dto3.setBankName("canaraBank");
		dto3.setAccountNumber(1127456812l);
		dto3.setAddress("murdeswara");
		dto3.setBranchCode("bb0412");
		dto3.setContactNumber(6543217896l);
		dto3.setEmailId("canara@gmail.com");
		
		service.delete("canara@gmail.com");
		service.read();
		
	}

}
