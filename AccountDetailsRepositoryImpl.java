package com.xworkz.account.repository;

import com.xworkz.account.dto.AccountDto;

public class AccountDetailsRepositoryImpl extends AccountDetailsRepository {

	AccountDto[] dtos=new AccountDto[5];
	int index=0;
	@Override
	public boolean onSave(AccountDto accountDto) {
		
		for(int i=0;i<dtos.length;i++) {
		if(dtos[i]!=null) {
			if(dtos[i].equals(accountDto)) {
				System.out.println("object is present");
				return false;
			}
			
		}
		}
		if(index<dtos.length) {
			dtos[index]=accountDto;
			index++;
			System.out.println("dto is saved successfully");
		}else {
			System.out.println("dto is not saved");
		}
		return false;
	}
	@Override
	public AccountDto[] read() {
		return dtos;
	}
	@Override
	public boolean updateBankName(String bankName, AccountDto accountDto) {
		boolean result=false;
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i]!=null) {
				if(dtos[i].getBankName().equalsIgnoreCase(bankName)) {
					dtos[i]=accountDto;
					result=true;
				}
			}
		}
		if(result==true) {
			return result;
		}
		return false;
	}
	@Override
	public boolean deleteEmailId(String emailId) {
		boolean result=false;
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i]!=null) {
				if(dtos[i].getEmailId().equalsIgnoreCase(emailId)) {
				result=true;
				}
			}
		}
		if(result=true) {
			return result;
		}
		return false;
	}

}
