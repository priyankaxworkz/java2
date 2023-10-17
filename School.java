package com.xworkz.test.things;

public class School {
	
	public String schoolName;
	public int fees;
	public byte teachers;
	public String principleName;
	public long contactNumber;
	
	//default constructor
	public School() {
		System.out.println("this is default constructor");
		}
	
	// parametrized constructor
	public  School(String schoolName,int fees,byte teachers,String principleName,long contactNumber) {
		
		this.schoolName=schoolName;
		this.fees=fees;
		this.teachers=teachers;
		this.principleName=principleName;
		this.contactNumber=contactNumber;
		
		System.out.println(this.schoolName);
		System.out.println(this.fees);
		System.out.println(this.teachers);
		System.out.println(this.principleName);
		System.out.println(this.contactNumber);
		
	
		
	}

}
