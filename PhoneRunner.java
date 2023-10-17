package com.xworkz.test.driver;

import com.xworkz.test.things.Phone;

public class PhoneRunner {
	public static void main(String[] args) {
		
		Phone phone=new Phone();
		phone.numbers(11);
		phone.numbers(6);
		phone.numbers(15);
		phone.numbers(13);
		 phone.getNumbers();
	}

}
