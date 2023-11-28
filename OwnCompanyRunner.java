package com.xworkz.company;

import com.xworkz.company.abstracts.OwnCompany;
import com.xworkz.companyimpl.HikeCompany;

public class OwnCompanyRunner {
	
	public static void main(String[] args) {
		
		OwnCompany company=new HikeCompany();
		
		company.companyName();
		company.ceo();
	}

}
