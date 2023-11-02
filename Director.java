package com.xworkz.Shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Director {
	private String name;
	private int salary;
	private int totalMovies;
	private String education;
	
	public Director() {
		System.out.println("this is parent class");
	}
	

}
