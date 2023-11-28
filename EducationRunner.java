package com.xworkz.education;

import com.xworkx.educationimplementation.College;
import com.xworkz.education.abstracts.Education;

public class EducationRunner {

	public static void main(String[] args) {
		
		Education education=new College();
		
		education.minister();
		education.managment();
		education.totalDepartment();
		education.educationType();
	}
}
