package com.xworkz.education.abstracts;

import com.xworkz.educationDto.EducatioDto;

public  abstract class Education {

	public abstract void minister();
	
	public abstract void managment();
	
	public abstract void totalDepartment();
	
	public abstract void educationType();
	
	public abstract boolean onSave(EducatioDto educatioDto);
}
