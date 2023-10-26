package com.xworkz.test.things;

public class Ksrtc {
	
	private String busName;
	private String busNumber;
	private int noOfSeats;
	private String to;
	private String from;
	
	
	public Ksrtc() {
		System.out.println("this is no args constructor");
	}
	
	public Ksrtc(String busName,String busNumber, int noOfSeats, String to, String from) {
		this.busName=busName;
		this.busNumber=busNumber;
		this.noOfSeats=noOfSeats;
		this.to=to;
		this.from=from;
	}
	
	public void setBusName(String busName) {
		this.busName=busName;
	}
	public void SetNumber(String busNumber) {
		this.busNumber=busNumber;
	}
	
	public void setSeats(int noOfSeats) {
		this.noOfSeats=noOfSeats;
	}
	public void setTo(String to) {
		this.to=to;
	}
	public void setFrom(String from) {
		this.from=from;
	}

	public String getBusName() {
		return this.busName;
	}
	public String getBusNumber() {
		return this.busNumber;
	}
	public int getNoOfSeats() {
		return this.noOfSeats;
	}
	public String getTo() {
		return this.to;
	}
	public String getFrom() {
		return this.from;
	}
}
