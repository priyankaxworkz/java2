package com.xworkz.account.repository;

import com.xworkz.account.dto.AccountDto;

public  abstract class AccountDetailsRepository {
	
	public abstract boolean onSave(AccountDto accountDto);
	
	public abstract AccountDto[] read();
	
	public abstract boolean updateBankName(String bankName, AccountDto accountDto);
	
	public abstract boolean deleteEmailId(String emailId);

}
