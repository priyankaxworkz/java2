package com.xworkz.educationDto;

public class EducatioDto {
	
	private String minister;
	private String universityName;
	private int fees;
	
	public EducatioDto() {
		System.out.println("no arguments constructor");
	}

	public EducatioDto(String minister,String universityName,int fees) {
		this.minister=minister;
		this.universityName=universityName;
		this.fees=fees;
	}

	public void setMinister(String minister) {
		this.minister = minister;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public String getMinister() {
		return minister;
	}

	public String getUniversityName() {
		return universityName;
	}

	public int getFees() {
		return fees;
	}
	
	public String toString() {
		System.out.println("this is to string method");
		return null;
	}
	public int hashCode() {
		System.out.println("this is hashcode method");
		return 500;
	}
	
	public boolean equals(Object obj) {
		System.out.println("this is equals method");
		return true;
	}
}
