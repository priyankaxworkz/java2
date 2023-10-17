package com.xworkz.test.driver;

import com.xworkz.test.things.ProductName;

public class ProductNameRunner {
	public static void main(String[] args) {
		ProductName productName=new ProductName();
		productName.onSave("monkey555");
		productName.onSave("monkey999");
		productName.onSave("monkey777");
		productName.onSave("monkey888");
		
		productName.getElements();
		
	}

}
