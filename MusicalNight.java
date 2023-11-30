package com.xworkz.musicalnight.abstracts;

import com.xworkz.musicalnightdto.MusicalNightDto;

public abstract class MusicalNight {
	
	public abstract boolean onSave(MusicalNightDto musicalNightDto);
	
	public abstract void read();

}
