package com.xworkz.Shopping.things;

public class Vehicle {
	
	public String nameOfVehicle;
	public int price;
	
	public Vehicle() {
		this("bike",400000);
		System.out.println("this is default constructor");
	}
	public Vehicle(String nameOfVehicle,int price) {
		System.out.println("this all arguments constructor");
		this.nameOfVehicle=nameOfVehicle;
		this.price=price;
	}
	
	public class Car{
		public String nameOfCar;
		public int price;
		
		
		public Car() {
			this("bmw",800000);
			System.out.println("this is no arguments constructor");
			}
		
		public Car(String nameOfCar) {
			this();
			System.out.println("this is one arguments coonstructor");
			this.nameOfCar=nameOfCar;
		}
		
		public Car(String nameOfCar,int price) {
			System.out.println("all arguments constructor");
			this.nameOfCar=nameOfCar;
			this.price=price;
		}


}
}
