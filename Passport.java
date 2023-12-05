package com.xworkz.passportimpl;

import com.xworkz.passport.PassportAbstract;
import com.xworkz.passportdto.PassportDto;


public class Passport extends PassportAbstract {

	int index=0;
	Object[] obj= new Object[3];
	

	@Override
	public boolean onSave(PassportDto passportDto) {
	  if(passportDto!=null) {
		  System.out.println("dto is present");
	  
	  if(index<obj.length) {
		  obj[index]=passportDto;
		  index++;
	  }
	  }else {
		  System.out.println("dto is not present");
	  }
	  return false;
		
	}

	@Override
	public void read() {
	 for(Object object:obj) {
		 System.out.println("read all the elements:"+object);
	 }
		
	}
	@Override
	public void searchByCurrentAddress(String currentAddress) {
		for(Object object:obj) {
					if(object.toString().contains(currentAddress)) {
			System.out.println("current address is:"+object);
		}
			}
		
	}

	@Override
	public void searchByContactNumber(long contactNumber) {
			System.out.println("search by contact number is:"+contactNumber);
			for(Object object:obj) {
				PassportDto dto=(PassportDto)object;
					if(dto.getContactNumber()==contactNumber) {
						System.out.println("contactNumber is:"+dto.toString());
			
				}
					//System.out.println("search by contactNumber:"+object);
			}
		
	}

	@Override
	public void updateByApplicationId(int applicationId,PassportDto passportDto) {
		if(passportDto!=null){
		for(Object object:obj) {
			PassportDto dto=(PassportDto) object;
			if(dto.getApplicationId()==applicationId) {
				//object=passportDto;
			}
				System.out.println("update method is:"+object);
			
				
			}
		}
		
	}

	@Override
	public void updateByEmail(String email, PassportDto passportDto) {
		if(passportDto!=null) {
			for(Object object:obj) {
				PassportDto dto=(PassportDto) object;
				if(dto.getEmail()==email) {
					object=passportDto;
				}
				System.out.println("update the email is:"+object);
			}
		}
		
	}

	@Override
	public void deleteByApplicationId(int applicationId) {
		for(Object object:obj) {
			if(object!=null) {
		PassportDto dto=(PassportDto)object;
		if(dto.getApplicationId()==applicationId) {
	object=null;
		}
			System.out.println("delete method is:"+object);
		}
		}
		
	}
	
	
	
	
}
