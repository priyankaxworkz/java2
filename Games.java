package com.xworkz.test.things;

public class Games {
	
	int index=0;
	String[] gameNames=new String[6];
	
	public void onSave(String names) {
		if(index<gameNames.length){
		gameNames[index]=names;
		index++;
		//System.out.println("array of the length is:"+gameNames.length);
		}else {
			System.out.println("array is full");
		}
	}
	
	public void read() {
		for(int i=0;i<gameNames.length;i++) {
			System.out.println("games name is:"+gameNames[i]);
		}
	}
	
	public void update(String oldName, String newName) {
		for(int i=0;i<gameNames.length;i++) {
			if(gameNames[i]==oldName) {
				gameNames[i]=newName;
			}else {
				System.out.println("not exist");
				break;
			}
		}
	}
public void delete(String element) {
	for(int i=0;i<gameNames.length;i++) {
		if(gameNames[i]==element) {
			gameNames[i]="highjump";
		}
		if(i==(gameNames.length-1)&& gameNames[i]!=element) {
			System.out.println("not exist");
		}
	}
}
}
