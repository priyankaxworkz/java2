package com.xworkz.interview.things;

public class Crud {
	
	int index=0;
	
	char[] size=new char[2];
	
	public void onSave(char cloth) {
		System.out.println("size of the cloth is:"+cloth);
		
		if(index<size.length) {
			size[index]=cloth;
					index++;
		}else {
		System.out.println("array is full");
	}
	}
	
	public void read() {
		for(int i=0;i<size.length;i++) {
			System.out.println(size[i]);
		}
	}
	
	public void update(char oldElement, char newElement) {
		for(int i=0;i<size.length;i++) {
			if(size[i]==oldElement) {
				size[i]=newElement;
			}else {
				//System.out.println("not exist..");
				//break;
			}
		}
	}
	public void delete(char element) {
		for(int i=0;i<size.length;i++) {
			if(size[i]==element) {
				size[i]='m';
			}else {
			if(i==(size.length-1)&&size[i]!=element);
			//System.out.println("not exist");
		}
	}
		}

}
