package com.xworkz.test.driver;
import com.xworkz.test.things.Toys;

public class ToysRunner {
	public static void main(String[] args) {
		Toys toy=new Toys();
		System.out.println(toy);
		ToysRunner toy1=new ToysRunner();
		System.out.println(toy1);
		Toys toy2=new Toys();
		System.out.println(toy2);
		ToysRunner toy3=new ToysRunner();
		System.out.println(toy3);
		System.out.println(new Toys());
		System.out.println(new ToysRunner());
	}

}
