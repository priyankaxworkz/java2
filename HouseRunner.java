package com.xworkz.house;

import com.workz.house.abstracts.House;
import com.xworkz.houseimple.NativeHouse;

public class HouseRunner {
	
	public static void main(String[] args) {
		House house=new NativeHouse();
		
		house.houseName();
		house.mainHead();
		house.totalMembers();
	}

}
