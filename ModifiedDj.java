package com.xworkz.musicalNightImplementation;

import com.xworkz.musicalnight.abstracts.MusicalNight;
import com.xworkz.musicalnightdto.MusicalNightDto;

public class ModifiedDj  extends MusicalNight{
	Object[] obj=new Object[2];
	int index=0;
	public boolean onSave(MusicalNightDto musicalNightDto) {
		if(musicalNightDto!=null) {
			System.out.println("dto is null");
			if(index<obj.length) {
				obj[index]=musicalNightDto;
				index++;
			}
			}
		else {
			System.out.println("dto is not null");
		}
		return false;
	}
	
	public void read() {
		for(Object object:obj) {
			System.out.println("object is:"+object);
		}
	}

}


