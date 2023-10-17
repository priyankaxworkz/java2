package com.xworkz.test.things;
import java.util.Date;

public class Telegram {
	
	public String userName;
	public int password;
	public String email;
	public long contactNumber;
	public String address;
	public Date accountCreateDate;
	public String gender;
	
	//1
	public Telegram(){
		this("fvc",789654,"fvc89_",786543256l);
		System.out.println("this is default constructor");
	}
	
	//2
  public Telegram(String userName){
	  System.out.println("this is parametrized constructor with 1 args");
	this.userName=userName;
	System.out.println("userName:"+userName);
	}
  
  //3
  public Telegram(String userName,int password) {
	  this();
	  System.out.println("this is parametrized constructor with 2 args");
	  this.userName=userName;
	  this.password=password;
	  System.out.println("userName:"+userName+""+"password:"+password);
  }
  //4
  public Telegram(String userName,int password,String email,long contactNumber) {
	  System.out.println("this is parametrized constructor with 4 args");
	  this.userName=userName;
	  this.password=password;
	  this.email=email;
	  this.contactNumber=contactNumber;
	  System.out.println("userName:"+userName+""+"password:"+password+""+"email:"+email+""+"contactNumber:"+contactNumber);
	  }
  
  //5
  public Telegram(String userName,int password,String email,long contactNumber,String address) {
	  System.out.println("this is parametrized constructor with 5 args");
	  this.userName=userName;
	  this.password=password;
	  this.email=email;
	  this.contactNumber=contactNumber;
	  this.address=address;
	  System.out.println("userName:"+userName+""+"password:"+password+""+"email:"+email+""+"contactNumber:"+contactNumber+""+"address:"+address);
  }
  
  //6
  public Telegram(String userName,int password,String email,long contactNumber,String address,Date accountCreateDate) {
	  System.out.println("this is parametrized constructor with 6 args");
	  this.userName=userName;
	  this.password=password;
	  this.email=email;
	  this.contactNumber=contactNumber;
	  this.address=address;
	  this.accountCreateDate=accountCreateDate;
	  System.out.println("username:"+userName+""+"password:"+password+""+"email:"+email+""+"contactNumber:"+contactNumber+""+"address:"+address+""+"accountCreateDate");
  }
  
  //7
  public Telegram(String userName,int password,String email,long contactNumber,String address,Date accountCreateDate,String gender) {
	  System.out.println("this is parametrized constructor with 7 args");
	  this.userName=userName;
	  this.password=password;
	  this.email=email;
	  this.contactNumber=contactNumber;
	  this.address=address;
	  this.accountCreateDate=accountCreateDate;
	  System.out.println("userName:"+userName+""+"password:"+password+""+"email:"+email+""+"contactNumber:"+contactNumber+""+"address:"+address+""+"accountCreateDate:"+accountCreateDate+""+"gender:"+gender);
  }
}
