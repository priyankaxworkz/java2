package com.xworkz.interview.driver;

import com.xworkz.interview.things.CrudOperation;

public class CrudOperationRunner {

	public static void main(String[] args) {
		
		CrudOperation crud=new CrudOperation();
		
		crud.onSave(250);
		crud.onSave(300);
	   System.out.println("this is on save mwthod");
	   
	   crud.read();
	   System.out.println("this is read method");
	
	   crud.update(300,450);
	   crud.read();
	   System.out.println("this is update method");
	   
	crud.delete(300);
	crud.read();
	System.out.println("this is delete method");
	}
}
