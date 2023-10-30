package com.xworkz.test.things;

public class Company {
	
	private String companyName;
	private String jobPost;
	private int vaccancy;
	private String qualification;
	private Education education;
	
	public Company() {
		System.out.println("no arguments constructor");
	}
	
	public Company(String companyName, String jobPost,int vaccancy,String qualification,Education education) {
		System.out.println("all argument constructor");
		this.companyName=companyName;
		this.jobPost=jobPost;
		this.vaccancy=vaccancy;
		this.qualification=qualification;
		this.education=education;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setJobPost(String jobPost) {
		this.jobPost = jobPost;
	}
	public void setVaccancy(int vaccancy) {
		this.vaccancy = vaccancy;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	
	public String getCompanyName() {
		return companyName;
	}
   public String getJobPost() {
		return jobPost;
	}
   public int getVaccancy() {
		return vaccancy;
	}
   public String getQualification() {
		return qualification;
	}
   public Education getEducation() {
		return education;
	}
}
