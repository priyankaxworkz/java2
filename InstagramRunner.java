package com.xworkz.test.driver;
import com.xworkz.test.things.Instagram;
public class InstagramRunner {
	
	public static void main(String[] args) {
		Instagram instagram1= new Instagram ();
		instagram1.userName="sdms";
		instagram1.password="fa23ry";
		instagram1. isProfileSet=true;
		instagram1.phoneNumber=6754328912l;
		instagram1.emailId="sd345mn";
		instagram1.dateOfBirth=832004;
		instagram1.location="banglore";
		instagram1.gender="female";
		instagram1.age=20;
		instagram1.accountType="personal";
		System.out.println(instagram1.userName);
		System.out.println(instagram1.password);
		System.out.println(instagram1.isProfileSet);
		System.out.println(instagram1.phoneNumber);
		System.out.println(instagram1.emailId);
		System.out.println(instagram1.dateOfBirth);
		System.out.println(instagram1.location);
		System.out.println(instagram1.gender);
		System.out.println(instagram1.age);
		System.out.println(instagram1.accountType);
		{
			
			if(instagram1.isProfileSet==true) {
				System.out.println("is profileset");}else {
					System.out.println("is not profileSet");}
			}
			{
			
				if(instagram1.location=="banglore") {
					System.out.println("location is  banglore");
				}else {
					System.out.println("location is not banglore");
				}	
				}
			{
				if(instagram1.password==null) {
					System.out.println("password is  null");
				}else {
					System.out.println("password is not null");
				}
				}
			}



}
