package com.xworkz.interview.driver;

import com.xworkz.interview.things.Crud;

public class CrudRunner {
	
	public static void main(String[] args) {
		
		Crud crud=new Crud();
		
		crud.onSave('s');
	    crud.onSave('l');
	    System.out.println("this is on save method");
	    
	crud.read();
	System.out.println("this is read method");
	
	crud.update('l', 'x');
	crud.read();
	System.out.println("this is update method");
	
	crud.delete('x');
	crud.read();
	System.out.println("this is delete method");
	}

	
}
