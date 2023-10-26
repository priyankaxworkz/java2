package com.xworkz.test.things;

public class Colleges {
	
	private String collegeName;
	private int noOfStudent;
	private byte noOfLectures;
	private short classRooms;
	
	/*public Colleges(String collegeName,int noOfStudent,byte noOfLectures,short classRooms) {
		//System.out.println("this is parameterized constructor");
		this.collegeName=collegeName;
		this.noOfStudent=noOfStudent;
		this.noOfLectures=noOfLectures;
		this.classRooms=classRooms;
	}*/
	
	public void setCollegeName(String collegeName) {
		this.collegeName=collegeName;
	}
	
	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent=noOfStudent;
	}
	
	public void setNoOfLectures(byte noOfLectures) {
		this.noOfLectures=noOfLectures;
	}
    public void setClassRooms(short classRooms) {
    	this.classRooms=classRooms;
    	}
    public String getCollegeName() {
    	return this.collegeName;
    }
    public int getNoOfStudent() {
    	return this.noOfStudent;
    }
    public byte getNoOfLectures() {
    	return this.noOfLectures;
    	}
    public short getClassRooms() {
    	return this.classRooms;
    }
}
