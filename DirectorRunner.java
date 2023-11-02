package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Movie;

public class DirectorRunner {
	public static void main(String[] args) {
		
	Movie m=new Movie();
	
	m.setName("xx");
	m.setSalary(50000);
	m.setTotalMovies(5);
	m.setEducation("be");
	
	System.out.println(m.getName());
	System.out.println(m.getSalary());
	System.out.println(m.getTotalMovies());
	System.out.println(m.getEducation());
	}

}
