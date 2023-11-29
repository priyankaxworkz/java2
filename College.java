package com.xworkx.educationimplementation;

import com.xworkz.education.abstracts.Education;
import com.xworkz.educationDto.EducatioDto;

public class College  extends Education{

	public void minister() {
		System.out.println("this is education minister is sudhakar");
	}
	
	public void managment() {
		System.out.println("the managment is good");
	}
	
	public void totalDepartment() {
		
		System.out.println("the total department in the college");
	}
	
	public void educationType() {
		System.out.println("the education type is offline");
	}
	
	Object[] obj=new Object[2];
	int index=0;
	
	public boolean onSave(EducatioDto educatioDto) {
		if(educatioDto!=null) {
			System.out.println("dto is not null");
		
		if(index<obj.length) {
			obj[index]=educatioDto;
			index++;
		}
		}else {
			System.out.println("dto is null");
		}
		return false;
		
	}
}


