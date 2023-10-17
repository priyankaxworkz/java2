package com.xworkz.test.driver;
import com.xworkz.test.things.Os;

public class OsRunner {
	public static void main(String args[]) {
		Os.getOsInformation();
		Os.getOsInformation("window",5.1);
		boolean getOsVersion=Os.getOsVersion();
		System.out.println(getOsVersion);
		}

}
