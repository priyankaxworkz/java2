package com.xworkz.test.driver;

import com.xworkz.test.things.SoftwareNames;

public class SoftwareNamesRunner {
	
	public static void main(String[] args) {
		SoftwareNames softwareNames= new SoftwareNames();
		softwareNames.names("excel");
		softwareNames.names("macOS");
		softwareNames.names("linux");
		
		softwareNames.getNames();
	}

}
