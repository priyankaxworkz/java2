package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Channels;

public class TelevisionRunner {
 public static void main(String[] args) {
	 
	 Channels channel=new Channels();
	 
	 channel.getPrice(250);
	 channel.getNames("lg");
	 channel.getTelevisionInfo();
	 
	// System.out.println(channel.getTelevisionInfo);
	// System.out.println(channel.getNames);
	//System.out.println(channel.getPrice);
 }
}
