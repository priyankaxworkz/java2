package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Person;

public class DancerRunner {
	
	public static void main(String[] args) {
		Person p=new Person();
		
		p.setDanceName("bhartanatyam");
		p.setTotalDancer(6);
		p.setChoreographer("nayana");
		p.setKathakli(false);
		
		System.out.println(p.getDanceName());
		System.out.println(p.getTotalDancer());
		System.out.println(p.getChoreographer());
		System.out.println(p.isKathakli());
	}

}
