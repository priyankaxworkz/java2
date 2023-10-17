package com.xworkz.test.driver;
import com.xworkz.test.things.Gmail;

public class GmailRunner {
	public static void main(String... args) {
		
		Gmail gmail=new Gmail();
		gmail.getMessage();
		//gmail.getSendMessage();
		
		gmail.getContactNumbers(12,34,45);
		gmail.getContactNames("bussiness","personal");
		
		
	}

}
