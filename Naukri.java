package com.xworkz.test.things;

public class Naukri {
	
	private String loginId;
	private String userName;
	private boolean resume;
	private Company company;
	private JobSeeker jobSeeker;
	
	public Naukri() {
		System.out.println("no arguments constructor");
	}

	public Naukri(String loginId, String userName, boolean resume, Company company, JobSeeker jobSeeker) {
		System.out.println("all arguments constructor");
		this.loginId = loginId;
		this.userName = userName;
		this.resume = resume;
		this.company = company;
		this.jobSeeker = jobSeeker;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setResume(boolean resume) {
		this.resume = resume;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker=jobSeeker;
	}
	public String getLoginId() {
		return loginId;
	}
    public String getUserName() {
		return userName;
	}
    public boolean isResume() {
		return resume;
	}
    public Company getCompany() {
		return company;
	}
   public JobSeeker getJobSeeker() {
		return jobSeeker;
	}

  }
