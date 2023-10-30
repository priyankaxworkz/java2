package com.xworkz.test.things;

public class JobSeeker {
	
	private String seekerName;
	private int salaryPackages;
	private String companyName;
	private String qualification;
	private String post;
	private String manager;
	private Education education;
	
	public JobSeeker() {
		System.out.println("no arguments constructor");
	}

	public JobSeeker(String seekerName, int salaryPackages, String companyName, String qualification, String post,
			String manager, Education education) {
		this.seekerName = seekerName;
		this.salaryPackages = salaryPackages;
		this.companyName = companyName;
		this.qualification = qualification;
		this.post = post;
		this.manager = manager;
		this.education = education;
	}

	public void setSeekerName(String seekerName) {
		this.seekerName = seekerName;
	}
	public void setSalaryPackages(int salaryPackages) {
		this.salaryPackages = salaryPackages;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
  
	public String getSeekerName() {
		return seekerName;
	}
   public int getSalaryPackages() {
		return salaryPackages;
	}
   public String getCompanyName() {
		return companyName;
	}
   public String getQualification() {
		return qualification;
	}
   public String getPost() {
		return post;
	}
   public String getManager() {
		return manager;
	}
   public Education getEducation() {
		return education;
	}
}
