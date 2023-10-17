package com.xworkz.test.driver;
import com.xworkz.test.things.Shooping;

public class ShoopingRunner {
	public static void main(String[] args) {
		String[] names= Shooping.getArray();
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		double[] disscount=Shooping.getRate();
		for(int i=0;i<disscount.length;i++) {
			System.out.println(disscount[i]);
		}
		boolean[] payment= Shooping.getArrays();
		for(int i=0;i<payment.length;i++) {
			System.out.println(payment[i]);
		}
		char[] size= Shooping.getCloth();
		for(int i=0;i<size.length;i++) {
			System.out.println(size[i]);
		}
		int[] rate=Shooping. getCloths();
		for(int i=0;i<rate.length;i++) {
			System.out.println(rate[i]);
		}
	}

}
