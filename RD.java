package com.xworkz.test.things;

public class RD {
	
	private int periods;
	private String startDate;
	private int rdNumber;
	
	public RD() {
		System.out.println("no arguments constructor");
	}
	public RD(int periods, String startDate, int rdNumber) {
		this.periods = periods;
		this.startDate = startDate;
		this.rdNumber = rdNumber;
	}
	public void setPeriods(int periods) {
		this.periods = periods;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public void setRdNumber(int rdNumber) {
		this.rdNumber = rdNumber;
	}
	
	public int getPeriods() {
		return periods;
	}
	
	public String getStartDate() {
		return startDate;
	}
	
	public int getRdNumber() {
		return rdNumber;
	}
	
	

}
