package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.HighLevel;

public class HighLevelRunner {
	public static void main(String[] args) {
		HighLevel h=new HighLevel();
		h.setName("java");
		h.setTotalLanguages(30);
		h.setUseable(true);
		h.setFounderName("james gasoline");
		
		System.out.println(h.getName());
		System.out.println(h.getTotalLanguages());
		System.out.println(h.isUseable());
		System.out.println(h.getFounderName());
	}

}
