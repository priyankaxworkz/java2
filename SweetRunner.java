package com.xworkz.test.driver;

import com.xworkz.test.things.Sweet;

public class SweetRunner {
	
	public static void main(String[] args) {
		
		Sweet sweet=new Sweet();
		System.out.println(sweet.name);
		System.out.println(sweet.price);
		System.out.println(sweet.bakeryName);
		System.out.println(sweet.totalSweet);
		System.out.println(sweet.disscount);
		
		Sweet sweet1=new Sweet();
		sweet1.name="champakali";
		sweet1.price=25;
		sweet1.bakeryName="avb";
		sweet1.totalSweet=45;
		sweet1.disscount=0.1;
		
		System.out.println(sweet1.name);
		System.out.println(sweet1.price);
		System.out.println(sweet1.bakeryName);
		System.out.println(sweet1.totalSweet);
		System.out.println(sweet1.disscount);
		
		
		Sweet sweet2=new Sweet();
		sweet2.name="laddu";
		sweet2.price=30;
		sweet2.bakeryName="gvm";
		sweet2.totalSweet=50;
		sweet2.disscount=0.2;
		System.out.println(sweet2.name);
		System.out.println(sweet2.price);
		System.out.println(sweet2.bakeryName);
		System.out.println(sweet2.totalSweet);
		System.out.println(sweet2.disscount);
		
		Sweet sweet3=new Sweet();
		sweet3.name="pedda";
		sweet3.price=25;
		sweet3.bakeryName="gg";
		sweet3.totalSweet=40;
		sweet3.disscount=0.1;
		System.out.println(sweet3.name);
		System.out.println(sweet3.price);
		System.out.println(sweet3.bakeryName);
		System.out.println(sweet3.totalSweet);
		System.out.println(sweet3.disscount);
		
		new Sweet();
		
		new Sweet("jamun",25,"ss",(byte)20,0.1);
		
	}
}		
		
		
		
		
		
		
		
		
		


