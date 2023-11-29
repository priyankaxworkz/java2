package com.xworkz.buildingdto;

public class BuildingDto {
	
	private String name;
	private int totalFloors;
	private String height;
	
	public BuildingDto() {
		System.out.println("no arguments constructor");
	}
	
	public BuildingDto(String name,int totalFloors,String height){
		this.name=name;
		this.totalFloors=totalFloors;
		this.height=height;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTotalFloors(int totalFloors) {
		this.totalFloors = totalFloors;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getTotalFloors() {
		return totalFloors;
	}

	public String getHeight() {
		return height;
	}
	
	public String toString() {
		System.out.println("this is to string method");
		return null;
	}
	
	public int hashCode() {
		System.out.println("this is hash code method");
		return 300;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("this is equals method");
	
		if (this == obj)
			return true;
		if (obj != null)
			return true;
		BuildingDto build=(BuildingDto) obj;
		if(this.name.equals(build.name))
		return true;
		return false;
    
	
	}

}
