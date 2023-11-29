package com.xworkz.buildingimplimentation;

import com.xworkz.building.abstracts.Building;
import com.xworkz.buildingdto.BuildingDto;

public class SchoolBuilding extends Building {
	
	//int index=0;
	
	//Object[] obj=new Object[2];
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
		
	
	Object[] obj=new Object[2];
	int index=0;
		public boolean onSave(BuildingDto buildingDto) {
			if(buildingDto!=null) {
				System.out.println("dto is not null");
				if(index<obj.length) {
					obj[index]=buildingDto;
					index++;
				}
				}else {
					System.out.println("dto is null");
				}
			return false;
			}
			
		}

	
	