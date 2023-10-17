package com.xworkz.test.things;

public class Gmail {
	
	public String userid;
	public String password;
	public int memory;
	public int numberOfMessage;
	public int numberOfContact;
	
	public Gmail() {
		System.out.println("this is no argument constructor");
	}
	
	public Gmail(String userid,String password,int memory,int numberOfMessage,int numberOfContacts) {
		this.userid=userid;
		this.password=password;
		this.memory=memory;
		this.numberOfMessage=numberOfMessage;
		this.numberOfContact=numberOfContacts;
		}
	
	public void getMessage() {
		this.getSendMessage();
		System.out.println("this is get message from gmail");
	}
	
	public void getSendMessage() {
		System.out.println("this is send message from gmail");
	}
	
	public void getContactNumbers(int... contactNumbers) {
		System.out.println("contactNumbers is:"+contactNumbers.length);
		
		for(int i=0;i<contactNumbers.length;i++) {
			System.out.println(contactNumbers[i]);
		}
	}
public void getContactNames(String... contactNames) {
	System.out.println("contactNames:"+contactNames.length);
	for(int a=0;a<contactNames.length;a++) {
		System.out.println(contactNames[a]);
	}
}
}
