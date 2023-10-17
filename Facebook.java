package com.xworkz.test.things;
import java.util.Date;

public class Facebook {
	
	public String userName;
	public int password;
	public String email;
	public long contactNumber;
	public String address;
	public Date accountCreateDate;
	public String gender;
	
	public Facebook() {
		this("tilak",56743);
		System.out.println("this is parametrized constructor");
	}
	
	public Facebook(String userName) {
		this();
		this.userName=userName;
		System.out.println("userName:"+userName);
	}
    public Facebook(String userName,int password) {
    	this("xyz",786544,"xyz34");
    	this.userName=userName;
    	this.password=password;
    	System.out.println("userName:"+userName+""+"password:"+password);
    }
    public Facebook(String userName,int password,String email) {
    	this("tycx",89775,"34tycx",9876543213l);
    	this.userName=userName;
    	this.password=password;
    	this.email=email;
    	System.out.println("userName:"+userName+""+"password:"+password+""+"email:"+email);
    }
    public Facebook(String userName,int password,String email,long contactNumber) {
    	this.userName=userName;
    	this.password=password;
    	this.email=email;
    	this.contactNumber=contactNumber;
    	System.out.println("userName:"+userName+""+"password:"+password+""+"email:"+email+""+"contactNumber:"+contactNumber);
    	}
    public Facebook(String userName,int password,String email,long contactNumber,String address) {
    	this.userName=userName;
    	this.password=password;
    	this.email=email;
    	this.contactNumber=contactNumber;
    	this.address=address;
    	System.out.println("userName:"+userName+""+"password:"+password+""+"email:"+email+""+"contactNumber:"+contactNumber+""+"address:"+address);
    }
    public Facebook(String userName,int password,String email,long contactNumber,String address,Date accountCreateDate) {
    	this.userName=userName;
    	this.password=password;
    	this.email=email;
    	this.contactNumber=contactNumber;
    	this.address=address;
    	this.accountCreateDate=accountCreateDate;
    	System.out.println("userName:"+userName+""+"password:"+password+""+"email:"+email+""+"contactNumber:"+contactNumber+""+"address:"+address+""+"accountCreateDate:"+accountCreateDate);
    }
    public Facebook(String userName,int password,String email,long contactNumber,String address,Date accountCreateDate,String gender) {
    	this.userName=userName;
    	this.password=password;
    	this.email=email;
    	this.contactNumber=contactNumber;
    	this.address=address;
    	this.accountCreateDate=accountCreateDate;
    	this.gender=gender;
    	System.out.println("userName:"+userName+""+"password:"+password+""+"email:"+email+""+"contactNumber:"+contactNumber+""+"address:"+address+""+"accountCreateDate:"+accountCreateDate+""+"gender:"+gender);
    }
}
