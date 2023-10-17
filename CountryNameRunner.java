package com.xworkz.test.driver;

import com.xworkz.test.things.CountryName;

public class CountryNameRunner {
	public static void main(String[] args) {
		CountryName countryName=new CountryName();
		
		countryName.onSave("india");
		countryName.onSave("nepal");
		countryName.onSave("china");
		countryName.onSave("america");
		System.out.println("this is on save method");
		
		countryName.read();
		System.out.println("this is read method");
		
		countryName.update( "india","australia");
		countryName.read();
		System.out.println("this is updated");
		
		countryName.delete("china");
		countryName.read();
		System.out.println("this is deleted");
		
	}

}
