package com.xworkz.test.things;

public class Food {
	public static void foodName() {
		System.out.println("gollibajje");
		}
	public static void famousPlace() {
		System.out.println("udupi");
	}
public static void itemsRequired() {
	System.out.println(5);
}
public static void sideCombination() {
	System.out.println(2);
}

public static void foodName(String name) {
	System.out.println(name);
}
public static void famousPlace(String place) {
	System.out.println(place);
	}
public static void itemsRequired(int itemsRequired) {
	System.out.println(itemsRequired);
}
public static void sideCombinations(double sideCombinations) {
	System.out.println(sideCombinations);
	}
public static String foodsName() {
	return "dossa";
}
public static String place() {
	return "Bhatkal";
}
public static int items() {
	return 2;
}
public static short combinations() {
	return 3;
}

public static String getArea(String name) {
	String area=name;
	System.out.println("area is:"+area);
	return area;
}
public static int getPeoplePerDay(int number) {
	int peoplePerDay=number;
	return peoplePerDay;
	}
public static int getWorkers(int totalNumber) {
	int workers=totalNumber;
	return workers;
}
public static String getHotelName(String hotelName) {
	String names=hotelName;
	return names;
}
}
