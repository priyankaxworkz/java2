package com.xworkz.interview.things;

public class CrudOperation {
	
	int index=0;
	
	int[] rate=new int[2];
	
	public void onSave(int rates) {
		System.out.println("rates is:"+rates);
	
	if(index<rate.length) {
		rate[index]=rates;
		index++;
		}else {
			System.out.println("array is full");
		}
	}
	
	public void read() {
		for(int i=0;i<rate.length;i++) {
			System.out.println(rate[i]);
		}
	}
		public void update(int oldElement,int newElement) {
			for(int i=0;i<rate.length;i++) {
				if(rate[i]==oldElement) {
					rate[i]=newElement;
				}
				else {
					System.out.println("not exist");
					//break;
				}
			}
	}
		public void delete(int element) {
			for(int i=0;i<rate.length;i++) {
				if(rate[i]==element) {
					rate[i]=500;
					}else {
						if(i==(rate.length-1)&&rate[i]!=element);
					}
			}
		}

}
