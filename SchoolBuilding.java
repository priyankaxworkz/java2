package com.xworkz.buildingimplimentation;

import com.xworkz.building.abstracts.Building;

public class SchoolBuilding extends Building {
	
	@Override
	public void pillar() {
		System.out.println("this is pillar method");
	}

	public void cement() {
			System.out.println("this is ultratech cement");
		}
	
	public void rod() {
		System.out.println("rods in the building");
	}
	
	public void soil() {
		System.out.println("the soil used in the building");
	}
	
	public void floors() {
		System.out.println("the total floors in the building");
	}
	}