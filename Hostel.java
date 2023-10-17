package com.xworkz.test.things;

public class Hostel {
	
	public String hostelName;
	public int totalStudent;
	public String wardenName;
	public short fees;
	public byte foods;
	
	public Hostel() {
		System.out.println("this is default constructor");
	}
	
	public Hostel(String hostelName,int totalStudent,String wardenName,short fees,byte foods) {
		this.hostelName=hostelName;
		this.totalStudent=totalStudent;
		this.wardenName=wardenName;
		this.fees=fees;
		this.foods=foods;
		System.out.println(this.hostelName);
		System.out.println(this.totalStudent);
		System.out.println(this.wardenName);
		System.out.println(this.fees);
		System.out.println(this.foods);
	}

}
