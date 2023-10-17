package com.xworkz.test.things;

public class God {
	public static void getNames(String[] name,byte[] eyes) {
		System.out.println("array length is:"+name.length);
		for(int i=0;i<name.length;i++) {
        for(int j=0;j<eyes.length;j++) {
        	if(name[i]=="Shiva") {
        		System.out.println("it is matched");
        	}else {
        		System.out.println("it is not matched");
        	}
        	System.out.println(name[i]);
        	System.out.println(eyes[j]);
        }
		}
	}
}
