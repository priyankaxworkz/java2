package com.xworkz.test.driver;

import com.xworkz.test.things.Holiday;

public class HolidayRunner {
	
	public static void main(String[] args) {
		
		Holiday holiday=new Holiday();
		
		holiday.numberOfDays=10;
		holiday.holidayPlan="mysore";
		holiday.holidayFor="dasara";
		holiday.partyName="dasara";
		
		System.out.println("number of days:"+holiday.numberOfDays);
		System.out.println("holiday plan is:"+holiday.holidayPlan);
		System.out.println("holiday for is:"+holiday.holidayFor);
		System.out.println("party name is:"+holiday.partyName);
	}

}
