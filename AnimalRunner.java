package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Dog;

public class AnimalRunner {
	
	public static void main(String[] args) {
	
		Dog dog=new Dog();
		 
		dog.setName("xx");
		dog.setPrice(5000);
		dog.setSize('l');
		dog.setHybrid("pitbul");
		
		System.out.println(dog.getName());
		System.out.println(dog.getPrice());
		System.out.println(dog.getSize());
		System.out.println(dog.getHybrid());;
	}

}
