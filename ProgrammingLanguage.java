package com.xworkz.Shopping.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProgrammingLanguage {
	
	private String name;
	private int totalLanguages;
	private boolean isUseable;
	private String founderName;
	
	public ProgrammingLanguage() {
		System.out.println("this is super class");
	}

}
