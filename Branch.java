package com.xworkz.test.things;

public class Branch {
	
	int index=0;
	
	String[] branchName=new String[3];
	
	public void onSave(String name) {
		if(index<branchName.length) {
			branchName[index]=name;
			index++;
			//System.out.println("length of an array is:"+branchName.length);
		}else {
			System.out.println("array is full");
		}
	}
	
	public void read() {
		for(int i=0;i<branchName.length;i++) {
			System.out.println("branch name is:"+branchName[i]);
		}
	}
	
	public void update(String oldName,String newName) {
		for(int i=0;i<branchName.length;i++) {
			if(branchName[i]==oldName) {
				branchName[i]=newName;
			}
		}
	}
	
	public void delete(String name) {
		for(int i=0;i<branchName.length;i++) {
			if(branchName[i]==name) {
				branchName[i]="electronics";
			}
			if(i==(branchName.length-1)&& branchName[i]!=name) {
				System.out.println("not exist");
			}
		}
	}

}
