package com.xworkz.test.things;

public class Linkdin {
	private String userName;
	private boolean resume;
	private int applied;
	private JobSeeker jobSeeker;
	private Company company;
	
	public Linkdin() {
		System.out.println("no arguments constructor");
	}

	public Linkdin(String userName,boolean resume,int applied,JobSeeker jobSeeker,Company company) {
		System.out.println("no arguments constructor");
		this.userName=userName;
		this.resume=resume;
		this.applied=applied;
		this.jobSeeker=jobSeeker;
		this.company=company;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setResume(boolean resume) {
		this.resume = resume;
	}
	public void setApplied(int applied) {
		this.applied = applied;
	}
	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public String getUserName() {
		return userName;
	}
    public boolean isResume() {
		return resume;
	}
    public int getApplied() {
		return applied;
	}
    public JobSeeker getJobSeeker() {
		return jobSeeker;
	}
    public Company getCompany() {
		return company;
	}

	
	
}
