package com.xworkz.test.things;

public class Education {
	
	private String qualification;
	private String educationType;
	private int fees;
	private String name;
	private int examFees;
	
	public Education() {
		System.out.println("no arguments constructor");
	}
    
	public Education(String qualification,String educationType,int fees,String name,int examFees) {
		System.out.println("all arguments constructor");
		this.qualification=qualification;
		this.educationType=educationType;
		this.fees=fees;
		this.name=name;
		this.examFees=examFees;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public void setEducationType(String educationType) {
		this.educationType = educationType;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setExamFees(int examFees) {
		this. examFees=examFees;
	}

	public String getQualification() {
		return qualification;
	}
    public String getEducationType() {
		return educationType;
	}
	public int getFees() {
		return fees;
	}
    public String getName() {
		return name;
	}

	public int getExamFees() {
		return examFees;
	}
}
