package com.xworkz.company;

import com.xworkz.company.abstracts.OwnCompany;
import com.xworkz.companydto.CompanyDto;
import com.xworkz.companyimpl.HikeCompany;

public class OwnCompanyRunner {
	
	public static void main(String[] args) {
		
		OwnCompany company=new HikeCompany();
		
		company.companyName();
		company.ceo();
		
		company.onSave(null);
		company.onSave(null);
		
		CompanyDto com=new CompanyDto();
		com.setCompanyName("xxx");
		com.setQualification("any stream");
		com.setSalary("3lpa");
		
		System.out.println(com.getCompanyName());
		System.out.println(com.getQualification());
		System.out.println(com.getSalary());
		
		System.out.println(com.toString());
		System.out.println(com.hashCode());
		System.out.println(com.equals(company));
	}

}
