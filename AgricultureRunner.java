package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Soil;

public class AgricultureRunner {
	
	public static void main(String[] args) {
		
		Soil s=new Soil();
	s.types=2;
	s.totaltypes=25;
	
	System.out.println("type is:"+s.types);
	System.out.println("total types is:"+s.totaltypes);
	//	s.price=300;
	System.out.println("place is:"+s.place);
	System.out.println("name is:"+s.soilName);
	
	System.out.println("crop name is:"+s.cropName);
	System.out.println("size is:"+s.size);
	
	System.out.println(s.fertilizerName);
	System.out.println(s.price);
	
		
		
		
	}

}
