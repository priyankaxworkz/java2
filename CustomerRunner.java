package com.xworkz.test.driver;

import com.xworkz.test.things.Shop;

public class CustomerRunner {

	public static void main(String[] args) {
		Shop shop=new Shop();
		shop.name="bvyv";
		shop.phoneNumber=987654328l;
		shop.id="gfy755";
		
		System.out.println("name is:"+shop.name);
		System.out.println("phone number is:"+shop.phoneNumber);
		System.out.println("id is:"+shop.id);
	}
}
