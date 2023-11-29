package com.xworkz.building;

import com.xworkz.building.abstracts.Building;
import com.xworkz.buildingdto.BuildingDto;
import com.xworkz.buildingimplimentation.SchoolBuilding;

public class BuildingRunner {
	
	public static void main(String[] args) {
		
	Building building=new SchoolBuilding();
	
	building.cement();
	building.rod();
	building.soil();
	building.pillar();
	building.floors();
	
	building.onSave(null);
	//building.onSave(null);

	
	BuildingDto build=new BuildingDto();
	build.setName("xxx");
	build.setHeight("4323ft");
	build.setTotalFloors(45);
	
	System.out.println(build.getName());
	System.out.println(build.getHeight());
	System.out.println(build.getTotalFloors());
	
	System.out.println(build.toString());
	System.out.println(build.hashCode());
	System.out.println(build.equals(build));
	
	}

}
