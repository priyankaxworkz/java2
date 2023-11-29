package com.workz.house.abstracts;

import com.xworkz.housedto.HouseDto;

public abstract class House {

	public abstract void totalMembers();
	
	public abstract void houseName();
	
	public abstract void mainHead();
	
	public abstract boolean onSave(HouseDto houseDto);
}
