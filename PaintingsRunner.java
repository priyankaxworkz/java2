package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Color;

public class PaintingsRunner {
	public static void main(String[] args) {
		
		Color color=new Color();
		
		color.paintingName="water painting";
		System.out.println("painting is:"+color.paintingName);
		//System.out.println("brushName is:"+color.brushName);
		color.setBrushName("xx");
	System.out.println("brush name is:"+color.getBrushName());
	
//color.name="pink";
//System.out.println("name of the color is:"+color.name);

	}

}
