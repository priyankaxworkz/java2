package com.xworkz.test.things;

public class ExamApplication {
	
	public String examName;
	public String qualification;
	public int fees;
	public int password;
	
	public ExamApplication() {
		System.out.println("this is default constructor");
	}
	
	public ExamApplication(String examName, String qualification,int fees,int password) {
	this.examName=examName;
	this.qualification=qualification;
	this.fees=fees;
	this.password=password;
	
/*	System.out.println(examName);
	System.out.println(qualification);
	System.out.println(fees);
	System.out.println(password); */
	}

}
