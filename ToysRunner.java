package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Toys;

public class ToysRunner {
	
	public static void main(String[] args) {
     Toys toys = new Toys();
     Toys toys1=new Toys();
     System.out.println("class name is:"+toys.getClass());
     System.out.println("String method is:"+toys.toString());
     System.out.println("hash code is:"+toys.hashCode());
     
   //  System.out.println(toys.equals(toys));
     System.out.println(toys.equals(toys1));
	}

}
