package com.xworkz.test.things;

public class Os {
	public static void getOsInformation() {
		System.out.println("this is OsInformation");
	}
	public static void getOsInformation(String osName,double osVersion) {
		System.out.println("name of the Os is:"+osName+ "version of the Os is:"+osVersion);
	
		if(osName=="window") {
			System.out.println("Osname is matched with window:"+osVersion);}
		else {System.out.println("Osname is not matched with window");
		}
	}
	public static boolean getOsVersion() {
		System.out.println("getOsVersion");
	return true;
}

}

