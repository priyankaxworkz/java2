package com.xworkz.test.things;

public class College {
	
	public String collegeName;
	public int fees;
	public byte teachers;
	public String principleName;
	public long contactNumber;
	
	public College() {
		System.out.println("this is default constructor");
	}
	
public College(String collegeName,int fees,byte teachers,String principleName,long contactNumber) {
		
		this.collegeName=collegeName;
		this.fees=fees;
		this.teachers=teachers;
		this.principleName=principleName;
		this.contactNumber=contactNumber;
		
		System.out.println(this.collegeName);
		System.out.println(this.fees);
		System.out.println(this.teachers);
		System.out.println(this.principleName);
}
}
