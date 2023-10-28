package com.xworkz.test.driver;

import com.xworkz.test.things.Country;
import com.xworkz.test.things.State;

public class CountryRunner {
	
	public static void main(String[] args) {
		Country country=new Country();
	
		State state=new State();
		state.setStateName("karnataka");
		state.setNumberOfDistrict(30);
		state.setNumberOfTaluk(240);
		state.setTotalPopulation("7 crores");
		state.setNumberOfVillage(27481);
		
		country.setState(state);
		System.out.println(country.getState().getStateName());
		System.out.println(country.getState().getNumberOfDistrict());
		System.out.println(country.getState().getNumberOfTaluk());
		System.out.println(country.getState().getTotalPopulation());
		System.out.println(country.getState().getNumberOfVillage());
	}

}
