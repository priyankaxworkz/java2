package com.xworkz.test.driver;

import com.xworkz.test.things.College;

public class CollegeRunner {
	
	public static void main(String[] args) {

	//creating object
		College college=new College();
		System.out.println(college.collegeName);
		System.out.println(college.fees);
		System.out.println(college.teachers);
		System.out.println(college.principleName);
		System.out.println(college.contactNumber);
		
		//using reference
		College college1=new College();
		college1.collegeName="bvips";
		college1.fees=25000;
		college1.teachers=45;
		college1.principleName="akahamsa";
		college1.contactNumber=9765432182l;
		System.out.println(college1.collegeName);
		System.out.println(college1.fees);
		System.out.println(college1.teachers);
	System.out.println(college1.principleName);
	System.out.println(college1.contactNumber);
	
	
College college2=new College();
	college2.collegeName="gv";
	college2.fees=20000;
	college2.teachers=34;
	college2.principleName="akash";
	college2.contactNumber=8765432198l;
	System.out.println(college2.collegeName);
	System.out.println(college2.fees);
	System.out.println(college2.teachers);
	System.out.println(college2.principleName);
	System.out.println(college2.contactNumber);
	
	
	College college3=new College();
	college3.collegeName ="rns";
	college3.fees=30000;
	college3.teachers=31;
	college3.principleName="divya";
	college3.contactNumber=8765432123l;
	System.out.println(college3.collegeName);
	System.out.println(college3.fees);
	System.out.println(college3.teachers);
	System.out.println(college3.principleName);
	System.out.println(college3.contactNumber);
	
	new College();
	
// parameterized constructor	
	new College("gvb",35000,(byte)45,"naime",9876543218l);
}	
}
