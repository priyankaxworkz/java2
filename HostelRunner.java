package com.xworkz.test.driver;
import com.xworkz.test.things.Hostel;
public class HostelRunner {

	public static void main(String[] args) {
		
		Hostel hostel=new Hostel();
		System.out.println(hostel.hostelName);
		System.out.println(hostel.totalStudent);
		System.out.println(hostel.wardenName);
		System.out.println(hostel.fees);
		System.out.println(hostel.foods);
		
		Hostel hostel1=new Hostel();
		hostel1.hostelName="vvn";
		hostel1.totalStudent=550;
		hostel1.wardenName="latha";
		hostel1.fees=20000;
		hostel1.foods=3;
		System.out.println(hostel1.hostelName);
		System.out.println(hostel1.totalStudent);
		System.out.println(hostel1.wardenName);
		System.out.println(hostel1.fees);
		System.out.println(hostel1.foods);
		
		Hostel hostel2=new Hostel();
		hostel2.hostelName="ppc";
		hostel2.totalStudent=550;
		hostel2.wardenName="mamtha";
		hostel2.fees=20000;
		hostel2.foods=3;
		System.out.println(hostel2.hostelName);
		System.out.println(hostel2.totalStudent);
		System.out.println(hostel2.wardenName);
		System.out.println(hostel2.fees);
		System.out.println(hostel2.foods);
		
		Hostel hostel3=new Hostel();
		hostel3.hostelName="ppc";
		hostel3.totalStudent=550;
		hostel3.wardenName="mamtha";
		hostel3.fees=20000;
		hostel3.foods=3;
		System.out.println(hostel3.hostelName);
		System.out.println(hostel3.totalStudent);
		System.out.println(hostel3.wardenName);
		System.out.println(hostel3.fees);
		System.out.println(hostel3.foods);
		
		new Hostel();
		
		new Hostel("gg",250,"latha",(short)15000,(byte)3);
	}
}
