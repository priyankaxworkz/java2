package com.xworkz.account.service;

import com.xworkz.account.dto.AccountDto;

public  abstract class AccountDetailsService {
	
	public abstract boolean validateDto(AccountDto accountDto);
	
	public abstract void read();
	
	public abstract void update(String bankName, AccountDto accountDto);

	public abstract void delete(String emailId);
}
