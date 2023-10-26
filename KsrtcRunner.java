package com.xworkz.test.driver;

import com.xworkz.test.things.Ksrtc;

public class KsrtcRunner {
	
 public static void main(String[] args) {
	 Ksrtc ksrtc=new Ksrtc();
	 
	 ksrtc.setBusName("shreeKumar");
	 ksrtc.SetNumber("KA47321");
	 ksrtc.setSeats(34);
	 ksrtc.setTo("murdeswara");
	 ksrtc.setFrom("banglore");
	 
	String name =ksrtc.getBusName();
	System.out.println(name);
	String number=ksrtc.getBusNumber();
	System.out.println(number);
	int seats=ksrtc.getNoOfSeats();
	System.out.println(seats);
	String to=ksrtc.getTo();
	System.out.println(to);
	String from=ksrtc.getFrom();
	System.out.println(from);
 }

}
