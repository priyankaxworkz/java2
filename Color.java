package com.xworkz.test.things;

public class Color {
	public String colorName;
	
	public Color() {
		System.out.println("this is no arguments method");
	}
	
	public Color(String colorName) {
		this.colorName=colorName;
	}

	public void getColorName(String...colorName) {
		System.out.println("color name is:"+colorName.length);
		for(int d=0;d<colorName.length;d++) {
			System.out.println(colorName[d]);
		}
	}
}
