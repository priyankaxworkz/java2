package com.xworkz.test.driver;

import com.xworkz.test.things.Branch;

public class BranchRunner {
	
	public static void main(String[] args) {
		
		Branch branch=new Branch();
		
		branch.onSave("civil");
		branch.onSave("mec");
		branch.onSave("cs");
		System.out.println("it is on save");
		
		branch.read();
		System.out.println("it is read");
		
		branch.update("civil", "aeronatics");
		branch.read();
		System.out.println("it is updated");
		
		branch.delete("cs");
		branch.read();
		System.out.println("it is deleted");
	}

}
