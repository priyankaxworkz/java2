package com.xworkz.test.driver;
import com.xworkz.test.things.River;
public class RiverRunner {
	public static void main(String args[]) {
		River.nameOfRiver();
		River.visit(345);
		short charge=River.getVehicleCharge();
		System.out.println(charge);
		
	}

}
