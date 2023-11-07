package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Wastage;

public class CraftRunner {

	public static void main(String[] args) {
		 Wastage w=new Wastage();
		 w.getCraftInfo();
		 w.getCraftType((byte)100);
		 w.getNameOfCraft("waterPainting");
		 
	//	 System.out.println(w.getCraftInfo);
	//	 System.out.println(w.getCraftType);
		 //System.out.println(w.getNameOfCraft);
	}
}
