package com.xworkz.interview.driver;

import com.xworkz.interview.things.Crud1;

public class Crud1Runner {

	public static void main(String[] args) {
		Crud1 crud=new Crud1();
		
		crud.onSave(500.0);
		crud.onSave(450.0);
		System.out.println("this is on save method");
		
		crud.read();
		System.out.println("this is read method");
		
		crud.update(450.0,400.0);
		crud.read();
		System.out.println("this is update method");
		
		crud.delete(400.0);
		crud.read();
		System.out.println("this is delete method");
	}
}
