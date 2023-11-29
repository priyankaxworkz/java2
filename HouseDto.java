package com.xworkz.housedto;

public class HouseDto {
	
	private String houseName;
	private int rent;
	private boolean isGood;
	
	public HouseDto() {
		System.out.println("no args constructor");
	}
	
	public HouseDto(String houseName,int rent,boolean isGood) {
		this.houseName=houseName;
		this.rent=rent;
		this.isGood=isGood;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}

	public String getHouseName() {
		return houseName;
	}

	public int getRent() {
		return rent;
	}

	public boolean isGood() {
		return isGood;
	}
	public String toString() {
		System.out.println("this is to string method");
		return "HouseDto";
	}
	
	public int hashCode() {
		System.out.println("this is hash code method");
		return 450;
	}
	
	public boolean equals(Object obj) {
		System.out.println("this is equals method");
		if(this==obj)
			return true;
		if(obj!=null)
			return false;
	HouseDto houseDto=(HouseDto)obj;
	if(this.houseName.equals(houseDto.houseName))
		return true;
	return false;
	}

}
