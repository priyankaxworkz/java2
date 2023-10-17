package com.xworkz.test.driver;

import com.xworkz.test.things.Food;

public class FoodRunner {
	public static void main(String args[]) {
		Food.foodName();
		Food.famousPlace();
		Food.itemsRequired();
		Food.sideCombination();
		Food.foodName("puri");
		Food.famousPlace("manipur");
		Food.itemsRequired(5);
		Food.sideCombinations(34.0);
		String name=Food.foodsName();
		System.out.println(name);
		 String place=Food.place();
		 System.out.println(place);
		 int items=Food.items();
		 System.out.println(items);
		 short combinations=Food.combinations();
		 System.out.println(combinations);
		 String area=Food.getArea("mangaluru");
		 System.out.println("area is:"+area);
         int peoplePerDay=Food.getPeoplePerDay(323);
		 System.out.println("people per day:"+peoplePerDay);
		 int workers=Food.getWorkers(34);
		 System.out.println("workers is:"+workers);
			String names=Food.getHotelName("ssd");
			System.out.println("hotel name is:"+names);
			}
	}
