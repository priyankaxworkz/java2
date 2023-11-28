package com.xworkz.interview.things;

public class Crud1 {
	
	int index=0;
	
	double[] rate=new double[3];
	
	public void onSave(double rates) {
		System.out.println("rates is:"+rates);
		
		if(index<rate.length) {
			rate[index]=rates;
			index++;
		}else {
			System.out.println("array is full");
		}
	}
	
	public void read() {
		for(int i=0;i<rate.length;i++) {
			System.out.println(rate[i]);
		}
	}
	
	public void update(double oldRates,double newRates) {
		for(int i=0;i<rate.length;i++) {
			if(rate[i]==oldRates) {
				rate[i]=newRates;
			}else {
				//System.out.println("not exist");
				//break;
			}
		}
	}
	
	public void delete(double ratee) {
		for(int i=0;i<rate.length;i++) {
			if(rate[i]==ratee) {
				rate[i]=350.0;
			}
			else{
		
			if(i==(rate.length-1)&&rate[i]!=ratee) {
				System.out.println("not exist");
			}
		}
		}
	}

	}
	
