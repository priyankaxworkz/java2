package com.xworkz.test.things;

public class Rain {
	
	public static void getDays(String[] days,boolean[] raining) {
		System.out.println("array of the length:"+days.length);
		for(int i=0;i<days.length;i++) {
		for(int b=0;b<raining.length;b++) {
			if(days[i] == "monday") {
				System.out.println("it is matched");}
			else{
				System.out.println("it is not matched");
			}
				System.out.println("days is:"+days[i]);
				System.out.println("raining is:"+raining[b]);
			}
		}
		}
}
