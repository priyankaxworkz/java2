package com.xworkz.house;

import com.workz.house.abstracts.House;
import com.xworkz.housedto.HouseDto;
import com.xworkz.houseimple.NativeHouse;

public class HouseRunner {
	
	public static void main(String[] args) {
		House house=new NativeHouse();
		
		house.houseName();
		house.mainHead();
		house.totalMembers();
		
		house.onSave(null);
		
		HouseDto houseDto=new HouseDto();
	
	    houseDto.setHouseName("vvv");
	    houseDto.setRent(20000);
	    houseDto.setGood(true);
	    System.out.println(houseDto.getHouseName());
	    System.out.println(houseDto.getRent());
	    System.out.println(houseDto.isGood());
	    
	    System.out.println(houseDto.toString());
	    System.out.println(houseDto.hashCode());
	    System.out.println(houseDto.equals(houseDto));
	    }

}
