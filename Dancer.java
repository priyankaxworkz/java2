package com.xworkz.Shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dancer {
	
	private String danceName;
	private int totalDancer;
	private String choreographer;
	private boolean isKathakli;
	
	public Dancer() {
		System.out.println("this is super class");
	}

}
