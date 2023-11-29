package com.xworkz.education;

import com.xworkx.educationimplementation.College;
import com.xworkz.education.abstracts.Education;
import com.xworkz.educationDto.EducatioDto;

public class EducationRunner {

	public static void main(String[] args) {
		
		Education education=new College();
		
		education.minister();
		education.managment();
		education.totalDepartment();
		education.educationType();
		
		education.onSave(null);
		education.onSave(null);
		
		EducatioDto edu=new EducatioDto();
		edu.setMinister("sudakar");
		edu.setFees(25000);
		edu.setUniversityName("manglore");
		System.out.println(edu.getMinister());
		System.out.println(edu.getFees());
		System.out.println(edu.getUniversityName());
		
		System.out.println(edu.toString());
		System.out.println(edu.hashCode());
		System.out.println(edu.equals(edu));
	}
}
