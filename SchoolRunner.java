package com.xworkz.test.driver;

import com.xworkz.test.things.School;

public class SchoolRunner {
public static void main(String[] args) {
	//creating object
	School school=new School();
	System.out.println(school.schoolName);
	System.out.println(school.fees);
	System.out.println(school.teachers);
	System.out.println(school.principleName);
	System.out.println(school.contactNumber);
	
	//using reference
	School school1=new School();
	school1.schoolName="bvips";
	school1.fees=25000;
	school1.teachers=45;
	school1.principleName="akahamsa";
	school1.contactNumber=9765432182l;
	System.out.println(school1.schoolName);
	System.out.println(school1.fees);
	System.out.println(school1.teachers);
	System.out.println(school1.principleName);
	System.out.println(school1.contactNumber);
	
	
	School school2=new School();
	school2.schoolName="gv";
	school2.fees=20000;
	school2.teachers=34;
	school2.principleName="akash";
	school2.contactNumber=8765432198l;
	System.out.println(school2.schoolName);
	System.out.println(school2.fees);
	System.out.println(school2.teachers);
	System.out.println(school2.principleName);
	System.out.println(school2.contactNumber);
	
	
	School school3=new School();
	school3.schoolName="rns";
	school3.fees=30000;
	school3.teachers=31;
	school3.principleName="divya";
	school3.contactNumber=8765432123l;
	System.out.println(school3.schoolName);
	System.out.println(school3.fees);
	System.out.println(school3.teachers);
	System.out.println(school3.principleName);
	System.out.println(school3.contactNumber);
	
	new School();
	
// parameterized constructor	
		 new School("gvb",35000,(byte)45,"naime",9876543218l);
}	
}
