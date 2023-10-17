package com.xworkz.test.driver;
import com.xworkz.test.things.AirCooler;

public class AirCoolerRunner {
	
	public static void main(String[] args) {
		AirCooler airCooler1=new AirCooler();
		airCooler1.price=5000;
		airCooler1.brand="bajaj";
		airCooler1.speed="65l";
		airCooler1.implNumber=3456742345l;
		
		System.out.println(airCooler1.price);
		System.out.println(airCooler1.brand);
		System.out.println(airCooler1.speed);
		System.out.println(airCooler1.temperature);
		System.out.println(airCooler1.implNumber);
		//System.out.println(airCooler1.disscount);
		{
			if(airCooler1.price==1000) {
				System.out.println("price is  thousand");
				}else {
					System.out.println("price is not thousand");
				}
			
			if(airCooler1.price<=2000 && airCooler1.price>=1000) {
		    System.out.println(airCooler1.price);
			System.out.println(airCooler1.brand);
			System.out.println(airCooler1.speed);
			System.out.println(airCooler1.temperature);
			System.out.println(airCooler1.implNumber);
			}
		}
		double totalPrice;
 //disscount=5000*(10/100)=>100;
//totalPrice=airCooler1.price-disscount;
 totalPrice=5000-100;
	System.out.println(totalPrice);
	}
}
