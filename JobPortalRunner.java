package com.xworkz.test.driver;

import com.xworkz.test.things.Company;
import com.xworkz.test.things.Education;
import com.xworkz.test.things.JobPortal;
import com.xworkz.test.things.JobSeeker;
import com.xworkz.test.things.Linkdin;
import com.xworkz.test.things.Naukri;

public class JobPortalRunner {
	
public static void main(String[] args) {
	
	Education education=new Education();
	
	education.setEducationType("offline");
	education.setExamFees(500);
	education.setFees(25000);
	education.setName("mgm");
	education.setQualification("bsc");
	
	Company company=new Company();
	company.setCompanyName("vvv");
	company.setJobPost("developer");
	company.setQualification("fullStack");
	company.setVaccancy(5);
	company.setEducation(education);
	
	JobSeeker jobSeeker=new JobSeeker();
	jobSeeker.setCompanyName("guy");
	jobSeeker.setManager("ragu");
	jobSeeker.setPost("manager");
	jobSeeker.setQualification("be");
	jobSeeker.setSalaryPackages(30000);
	jobSeeker.setSeekerName("prema");
	jobSeeker.setEducation(education);
	
	Naukri naukri=new Naukri();
	naukri.setLoginId("67fry67");
	naukri.setResume(true);
	naukri.setUserName("vby");
	naukri.setCompany(company);
	naukri.setJobSeeker(jobSeeker);
	
	Linkdin linkdin=new Linkdin();
	linkdin.setUserName("xxx");
	linkdin.setApplied(10);
	linkdin.setResume(true);
	linkdin.setCompany(company);
	linkdin.setJobSeeker(jobSeeker);
	
	JobPortal jobPortal=new JobPortal();
	jobPortal.setComapnyName("google");
	jobPortal.setJobPost("fullStack");
	jobPortal.setSalaryPackages(45000);
	jobPortal.setNaukri(naukri);
	jobPortal.setLinkdin(linkdin);
	 
	System.out.println(jobPortal.getNaukri().getCompany().getEducation().getEducationType());
	System.out.println(jobPortal.getNaukri().getCompany().getEducation().getQualification());
	System.out.println(jobPortal.getNaukri().getCompany().getEducation().getFees());
	System.out.println(jobPortal.getNaukri().getCompany().getEducation().getName());
	System.out.println(jobPortal.getNaukri().getCompany().getEducation().getExamFees());
	
	System.out.println(jobPortal.getLinkdin().getJobSeeker().getEducation().getEducationType());
	System.out.println(jobPortal.getLinkdin().getJobSeeker().getEducation().getExamFees());
	System.out.println(jobPortal.getLinkdin().getJobSeeker().getEducation().getName());
	System.out.println(jobPortal.getLinkdin().getJobSeeker().getEducation().getQualification());
	System.out.println(jobPortal.getLinkdin().getJobSeeker().getEducation().getFees());

}
}
