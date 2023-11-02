package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Vehicle;
import com.xworkz.Shopping.things.Vehicle.Car;

public class VehicleRunner {
	
	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		//vehicle.nameOfVehicle="bmw";
	System.out.println(vehicle.nameOfVehicle);
	System.out.println(vehicle.price);
	
	Car car=vehicle.new Car();
	
	System.out.println( "car name is:"+car.nameOfCar);
	System.out.println("car price is:"+car.price);
	}

}
