package com.xworkz.test.things;

public class Rivers {
	
	public static void riverName(String[] name) {
		System.out.println("this is river information");
		System.out.println("array of the length is:"+name.length);
		
		for(int i=0;i<name.length;i++) {
			System.out.println("river name is:"+name[i]);
		}
	}

	public static void  riverName(String[] name,String[] place) {
		System.out.println("place  of the river ");
	for(int p=0;p<place.length;p++) {
	System.out.println("places of the river is:"+place[p]);
	}
		}
	
	public static void riverName(String[] name,String[] place,String[] birthPlace) {
		System.out.println("birth place of the river ");
		for(int b=0;b<birthPlace.length;b++) {
			System.out.println("birth place of the river is:"+birthPlace[b]);
		}
	}
}
