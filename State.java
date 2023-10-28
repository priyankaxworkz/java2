package com.xworkz.test.things;

public class State {
	
	private String stateName;
	private int numberOfDistrict;
	private int numberOfTaluk;
	private String totalPopulation;
	private int numberOfVillage;

	public State() {
		System.out.println("no arguments constructor");
	}
	public State(String stateName,int numberOfDistrict,int numberOfTaluk,String totalPopulation,int numberOfVillage) {
		System.out.println("all arguments constructor");
		this.stateName=stateName;
		this.numberOfDistrict=numberOfDistrict;
		this.numberOfTaluk=numberOfTaluk;
		this.totalPopulation=totalPopulation;
		this.numberOfVillage=numberOfVillage;
	}
	
	public void setStateName(String stateName) {
		this.stateName=stateName;
	}
	public void setNumberOfDistrict(int numberOfDistrict) {
		this.numberOfDistrict=numberOfDistrict;
	}
	public void setNumberOfTaluk(int numberOfTaluk) {
		this.numberOfTaluk=numberOfTaluk;
	}
	public void setTotalPopulation(String totalPopulation) {
		this.totalPopulation=totalPopulation;
	}
	public void setNumberOfVillage(int numberOfVillage) {
		this.numberOfVillage=numberOfVillage;
	}
	
	public String getStateName() {
		return this.stateName;
	}
	public int getNumberOfDistrict() {
		return this.numberOfDistrict;
	}
	public int getNumberOfTaluk() {
		return this.numberOfTaluk;
	}
	public String getTotalPopulation() {
		return this.totalPopulation;
	}
	public int getNumberOfVillage() {
		return this.numberOfVillage;
	}
}
