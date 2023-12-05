package com.xworkz.passport;

import com.xworkz.passportdto.PassportDto;

public  abstract class PassportAbstract {
	
	public abstract boolean onSave(PassportDto passportDto);
	
	public abstract void read();
	
	public abstract void searchByCurrentAddress(String currentAddress);
	
	public abstract  void searchByContactNumber(long contactNumber);
	
	public abstract void updateByApplicationId(int applicationId,PassportDto passportDto);
	
	public abstract void updateByEmail(String email,PassportDto passportDto);
	
	public abstract void deleteByApplicationId(int applicationId);
}
