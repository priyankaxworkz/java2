package com.xworkz.Shopping.things;


	import lombok.Getter;
	import lombok.Setter;

	@Getter
	@Setter
	public class Company {
		
		private String name;
		private int totalEmployes;
		private int salary;
		private String hr;
		
		public Company(String name,int totalEmpolyes,int salary,String hr) {
			System.out.println("this is base class");
			
}
	}
