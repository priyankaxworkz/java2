package com.xworkz.test.things;
import java.util.Date;

public class Instagrams {
	
	public String userName;
	public int password;
	public String email;
	public long contactNumber;
	public String address;
	public Date accountCreateDate;
	public String gender;
	
	//constructor 1
	public Instagrams() {
		System.out.println("this is parametrized constructor");
	}
	
	//2
	public Instagrams(String userName) {
		this.userName=userName;
		System.out.println("userName:"+userName);
		}
	
	//3
	public Instagrams(String userName,int password) {
		this("cdxs",6753432,"cxcs345",8765432178l);
		this.userName=userName;
		this.password=password;
		System.out.println("userName:"+userName+""+"password:"+password);
	}
	
	//4
	public Instagrams(String userName,int password,String email) {
		this("guvc",897654,"guvcfdte67",6785432189l,"koppa");
		this.userName=userName;
		this.password=password;
		this.email=email;
		System.out.println("userName:"+userName+""+"password:"+password+""+"email:"+email);
	}
	
	//5
	public Instagrams(String userName,int password,String email,long contactNumber) {
		this();
		this.userName=userName;
		this.password=password;
		this.email=email;
		this.contactNumber=contactNumber;
		System.out.println("userName:"+userName+""+"password:"+password+""+"email:"+email+""+"contactNumber:"+contactNumber);
	}
	
	//6
	public Instagrams(String userName,int password,String email,long contactNumber,String address) {
		this("cbc",456739);
		this.userName=userName;
		this.password=password;
		this.email=email;
		this.contactNumber=contactNumber;
		this.address=address;
		System.out.println("userName:"+userName+""+"password:"+password+""+"email:"+email+""+"contactNumber:"+contactNumber+""+"address:"+address);
	}
	//7
	public Instagrams(String userName,int password,String email,long contactNumber,String address,Date accountCreateDate,String gender) {
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

