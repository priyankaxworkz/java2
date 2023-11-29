package com.xworkz.companydto;

public class CompanyDto {
	
	private String qualification;
	private String salary;
	private String companyName;
	
	public CompanyDto() {
		System.out.println("this is no args constructor");
	}
	
	public CompanyDto(String qualification,String salary,String companyName) {
		this.qualification=qualification;
		this.salary=salary;
		this.companyName=companyName;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getQualification() {
		return qualification;
	}

	public String getSalary() {
		return salary;
	}

	public String getCompanyName() {
		return companyName;
	}
	
	public String toString() {
		System.out.println("this is string method");
		return "CompanyDto";
	}
	public int hashCode() {
		System.out.println("this is hash code method");
		return 450;
	}
	
	public boolean equals(Object obj) {
		
		System.out.println("this is equals method");
		if(this==obj)
			return false;
		if(obj!=null)
			return false;
		CompanyDto company=(CompanyDto) obj;
		if(this.salary.equals(company.salary))
			return true;
		return false;
		}

}
