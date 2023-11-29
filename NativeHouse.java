package com.xworkz.houseimple;

import com.workz.house.abstracts.House;
import com.xworkz.housedto.HouseDto;

public class NativeHouse extends House {
	
	public void totalMembers() {
		System.out.println("there are 4 members");
	}
	
	public void houseName() {
		System.out.println("this is house name method");
	}
	
	public void mainHead() {
		System.out.println(" father is main head");
	}
	
	Object[] obj=new Object[1];
	int index=0;
	
	public boolean onSave(HouseDto houseDto) {
		if(houseDto!=null) {
			System.out.println("dto is not null");
			if(index<obj.length) {
				obj[index]=houseDto;
				index++;
			}
		}else {
			System.out.println("dto is null");
		}
		return false;
	}

}
