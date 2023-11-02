package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Empolyee;

	public class CompanyRunner {
		
		public static void main(String[] args) {
			
			Empolyee empolyee=new Empolyee();
			
		  empolyee.setName("vv");
		  empolyee.setTotalEmployes(250);
		  empolyee.setSalary(30000);
		  empolyee.setHr("ww");
		  
		  System.out.println(empolyee.getName());
		  System.out.println(empolyee.getTotalEmployes());
		  System.out.println(empolyee.getSalary());
		  System.out.println(empolyee.getHr());
		}

	}

