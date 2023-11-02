package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Ecommers;

public class ProductsRunner {
	 public static void main(String[] args) {
	Ecommers e=new Ecommers();
	e.setProductName("yy");
	e.setPrice(200);
	e.setQuality(4.2f);
	e.setStores("ww");
	
	System.out.println(e.getProductName());
	System.out.println(e.getPrice());
	System.out.println(e.getQuality());
	System.out.println(e.getStores());
}}
