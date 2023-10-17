package com.xworkz.test.things;
import java.util.Date;

public class Shine {
	public String userName;
	public int password;
	public String email;
	public long contactNumber;
	public String address;
	public Date accountCreateDate;
	public String gender;
	
	//1
	public Shine() {
		this("youf",7865);
		System.out.println("this is parmetrized constructor");
	}
	
	//2
	public Shine(String userName) {
		System.out.println("this is parametrized constructor with 1 args");
		this.userName=userName;
		System.out.println("userName:"+userName);
	}
    //3
	public Shine(String userName,int password) {
		this("ryt",67854,"ryt67",786543567l);
		System.out.println("this is parametrized constructor with 2 args");
		this.userName=userName;
		this.password=password;
		System.out.println("userName:"+userName+""+"password:"+password);
	}
	
	//4
	public Shine(String userName,int password,String email) {
		this();
		System.out.println("this is parametrized constructor with 3 args");
		this.userName=userName;
		this.password=password;
		this.email=email;
		System.out.println("username:"+userName+""+"password:"+password+""+"email:"+email);
	}
	//5
	public Shine(String userName,int password,String email,long contactNumber) {
		System.out.println("this is parametrized constructor with 4 args");
		this.userName=userName;
		this.password=password;
		this.email=email;
		this.contactNumber=contactNumber;
		System.out.println("userName:"+userName+""+"password:"+password+""+"email:"+email+""+"contactNumber:"+contactNumber);
	}
	//6 
	public Shine(String userName,int password,String email,long contactNumber,String address,Date accountCreateDate) {
		System.out.println("this is parametroized constructor with 6 args");
		this.userName=userName;
		this.password=password;
		this.email=email;
		this.contactNumber=contactNumber;
		this.address=address;
		this.accountCreateDate=accountCreateDate;
		System.out.println("userName:"+userName+""+"password:"+password+""+"email:"+email+""+"contactNumber:"+contactNumber+""+"address:"+address+""+"accountCreateDate:"+accountCreateDate);
		}
	//7
	public Shine(String userName,int password,String email,long contactNumber,String address,Date accountCreateDate,String gender) {
		System.out.println("this is parametrized constructor with 7 args");
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
	
