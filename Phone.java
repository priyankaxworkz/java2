package com.xworkz.test.things;

public class Phone {
	
	int index=0;
	
	int[] contactNumbers= new int[4];
	
	public void numbers(int contactList) {
		//System.out.println("contactNames is:"+contactList);
		if(index<contactNumbers.length) {
			contactNumbers[index]=contactList;
			index++;
			System.out.println("array of the length is:"+contactNumbers.length);
		}else {
			System.out.println("array is full");
		}
	}

	public void getNumbers() {
		for(int i=0;i<contactNumbers.length;i++) {
			System.out.println(contactNumbers[i]);
		}
	}
}
