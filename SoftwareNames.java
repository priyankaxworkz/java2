package com.xworkz.test.things;

public class SoftwareNames {
	
	int index=0;
	 String[] softwareNames=new String[3];
	 
	 public void names(String names) {
		 System.out.println("name is:"+names);
		 if(index<softwareNames.length) {
			 softwareNames[index]=names;
			 index++;
			 System.out.println("software names is:"+softwareNames.length);
		 }else {
			 System.out.println("array is full");
		 }
	 }
	 
	 public void getNames() {
		 for(int i=0;i<softwareNames.length;i++) {
			 System.out.println("software names is:"+softwareNames[i]);
		 }
	 }

}
