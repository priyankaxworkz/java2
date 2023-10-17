package com.xworkz.test.things;

public class IplTeam {
	
	int index=0;
	
	String[] teamName= new String[3];
	
	public void getTeamName(String name) {
		if(index<teamName.length) {
			teamName[index]=name;
			index++;
			System.out.println("array of the length is:"+teamName.length);
		}else {
			System.out.println("array is full");
		}
	}
	
	public void read() {
		for(int i=0;i<teamName.length;i++) {
			System.out.println(teamName[i]);
		}
	}
	
	public void update(String oldName,String newName) {
		for(int i=0;i<teamName.length;i++) {
			if(teamName[i]==oldName) {
				teamName[i]=newName;
			}else {
				System.out.println("not exist");
				break;
			}
		}
	}
	
	public void delete(String name) {
		for(int i=0;i<teamName.length;i++) {
			if(teamName[i]==name) {
				teamName[i]="gujarath";
			}
			if(i==(teamName.length-1)&& teamName[i]!=name) {
				System.out.println("not exist");
			}
		}
	}

}
