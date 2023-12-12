package com.xworkz.account.service;

import com.xworkz.account.dto.AccountDto;
import com.xworkz.account.repository.AccountDetailsRepository;
import com.xworkz.account.repository.AccountDetailsRepositoryImpl;

public class AccountDetailsServiceImpl extends AccountDetailsService {

	AccountDetailsRepository repo=new AccountDetailsRepositoryImpl();
	@Override
	public boolean validateDto(AccountDto accountDto) {
		if(accountDto!=null) {
			boolean bankName=validateDto(accountDto.getBankName());
			boolean emailId=validateEmailId(accountDto.getEmailId());
			boolean address=validateAddress(accountDto.getAddress());
			boolean branchCode=validateBranchCode(accountDto.getBranchCode());
			boolean contactNumber=validateContactNumber(accountDto.getContactNumber());
		
			
			if(bankName&&emailId&&address&&branchCode&&contactNumber) {
				boolean save=repo.onSave(accountDto);
				
		}
		}
		return false;
	}
	private boolean validateDto(String bankName) {
		
		if(bankName.isEmpty()) {
			System.out.println("is empty");
			return false;
			}
		if(bankName.isBlank()) {
			return false;
		}
		return true;
		
	}
	
	private boolean validateEmailId(String emailId) {
		if(emailId.isEmpty()) {
			System.out.println("is empty");
			return false;
		}
		if(emailId.isBlank()) {
			return false;
		}
		return true;
	}
	
	private boolean validateAddress( String address) {
		if(address.isEmpty()) {
			System.out.println("is empty");
			return false;
		}
		if(address.isBlank()) {
			return false;
		}
		return true;
	}
	
	private boolean validateBranchCode(String branchCode) {
		if(branchCode.isEmpty()) {
			System.out.println("is empty");
			return false;
		}
		if(branchCode.isBlank()) {
			return false;
		}
		return true;
	}
	
	private boolean validateContactNumber(long contactNumber) {
		
		return true;
		
	}
	@Override
	public void read() {
		AccountDto[] dto=repo.read();
		for(AccountDto accountDto:dto) {
			System.out.println(accountDto);
		}
		
	}
	@Override
	public void update(String bankName, AccountDto accountDto) {
		if(validateDto(accountDto.getBankName())) {
			boolean result=repo.updateBankName(bankName, accountDto);
			if(result==true) {
				System.out.println("updated");
			}
		}else {
				System.out.println("it is not updated");
			}
		}
	@Override
	public void delete(String emailId) {
		
		boolean result=repo.deleteEmailId(emailId);
		if(result==true) {
			System.out.println(" deleted");
		}else {
			System.out.println("it is not  deleted");
		}
		
	}
	
	}


