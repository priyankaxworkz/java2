package com.xworkz.building.abstracts;

import com.xworkz.buildingdto.BuildingDto;

public abstract class Building {

	public abstract void pillar();
	
	public abstract void cement();
	
	public abstract void rod();
	
	public abstract void soil();
	
	public abstract void floors();

public abstract boolean onSave(BuildingDto buildingDto);
}
