package com.xworkz.test.things;

public class CountryName {

	int index=0;
	
	String[] countryName=new String[4];
	
	public void onSave(String name) {
		if(index<countryName.length) {
			countryName[index]=name;
			index++;
			//System.out.println("length is:"+countryName.length);
		}else {
			System.out.println("array is full");
		}
	}
	
	public void read() {
		for(int i=0;i<countryName.length;i++) {
			System.out.println(countryName[i]);
		}
	}
	
	public void update(String oldName,String newName) {
		for(int i=0;i<countryName.length;i++) {
			if(countryName[i]==oldName) {
				countryName[i]=newName;
			}else {
				System.out.println("not exist");
				break;
			}
		}
	}
	
	public void delete(String element) {
		for(int i=0;i<countryName.length;i++) {
			if(countryName[i]==element) {
				countryName[i]="uk";
			}
			if(i==(countryName.length-1) &&countryName[i]!=element) {
				System.out.println("not exist");
			}
		}
	}
}
