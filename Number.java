package com.xworkz.palindromme.driver;

public class Number {
	
	public static void main(String[] args) {
		
		int number=121;
		int temp=number;
		int reverse=0;
		
		while(temp>0) {
			int remainder=temp%10;
			System.out.println("remainder is:"+remainder);
			
			reverse=(reverse*10)+remainder;
			System.out.println("reverse is:"+reverse);
			
			temp=temp/10;
			System.out.println("temp is:"+temp);
		}
		if(number==reverse) {
			System.out.println("it is a palindrome");}else {
				System.out.println("it is not a palindromme");
		}
	}

}
