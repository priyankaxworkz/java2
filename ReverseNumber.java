package com.xworkz.palindromme.driver;

public class ReverseNumber {

	public static void main(String[] args) {
	//int[] number= {1,2,3,4};
	
	//System.out.println(number.length);
	//for(int i=number.length-1;i>=0;i--) {
		//System.out.print(i);
	//}
		
		int number=34567456;

		int reverse=0;
		
		while(number!=0) {
			int remainder=number%10;
			reverse=reverse*10+remainder;
		    number=number/10;
			
		}
		System.out.println("reverse number is:"+reverse);
	
	
}
}
