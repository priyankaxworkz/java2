package com.xworkz.company.abstracts;

import com.xworkz.companydto.CompanyDto;

public  abstract class OwnCompany {
	
	public abstract void companyName();
	
	public abstract void ceo();
	
	public abstract boolean onSave(CompanyDto companyDto);
}
