package com.xworkz.test.driver;

import com.xworkz.test.things.ExamApplication;

public class ExamApplicationRunner {
	public static void main(String[] args) {
		
		ExamApplication examApplication=new ExamApplication("xyz","any Degree",250,45678);
	
	    System.out.println(examApplication.examName);
	    System.out.println(examApplication.qualification);
	    System.out.println(examApplication.fees);
	    System.out.println(examApplication.password);
		
		//new ExamApplication("vyv","any DEGREE",564,567484);
	   }

}
