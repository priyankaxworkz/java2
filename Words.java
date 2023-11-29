package com.xworkz.palindromme.driver;

public class Words {
	
	public static void main(String[] args) {
		
		String name="eye";
		
		String reverse="";
		
		int n=name.length();
		
		for(int i=0;i<n;i++) {
			reverse=reverse+name.charAt(i);
	
		System.out.println("reverse is:"+reverse);
		}
		if(name==reverse) {
			System.out.println("it is not apalindromme");
		}else {
			System.out.println("it is  a palindromme");
		
	}
		
		}

}
