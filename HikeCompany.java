package com.xworkz.companyimpl;

import com.xworkz.company.abstracts.OwnCompany;
import com.xworkz.companydto.CompanyDto;

public class HikeCompany extends OwnCompany {
	
	public void companyName() {
		System.out.println("the company name is xxx");
	}
	
	public void ceo() {
		System.out.println("the ceo of the comapny method");
	}

	
	Object[] obj=new Object[2];
	int index=0;
	@Override
	public boolean onSave(CompanyDto companyDto) {
		
		if(companyDto!=null) {
			System.out.println("dto is not null");
		
		if(index<obj.length) {
			obj[index]=companyDto;
			index++;}
		}else {
			System.out.println("dto is null");
		}
		return false;
		
	}
}
