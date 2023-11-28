package com.xworkz.abstraction;

import com.xworkz.abstraction.abstracts.Application;
import com.xworkz.abstraction.things.HikeApplication;

public class ApplicationRunner {

	public static void main(String[] args) {
		
		Application application=new HikeApplication();
		
		application.chat();
	}
}
