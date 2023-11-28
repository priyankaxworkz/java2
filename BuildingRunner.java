package com.xworkz.building;

import com.xworkz.building.abstracts.Building;
import com.xworkz.buildingimplimentation.SchoolBuilding;

public class BuildingRunner {
	
	public static void main(String[] args) {
		
	Building building=new SchoolBuilding();
	
	building.cement();
	building.rod();
	building.soil();
	building.pillar();
	building.floors();
	}

}
