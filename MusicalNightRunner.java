package com.xworkz.musicalnightrunner;


import com.xworkz.musicalNightImplementation.ModifiedDj;
import com.xworkz.musicalnight.abstracts.MusicalNight;
import com.xworkz.musicalnight.constants.Guest;
import com.xworkz.musicalnightdto.MusicalNightDto;

public class MusicalNightRunner {
	
	public static void main(String[] args) {
		
		MusicalNight musicalnight=new ModifiedDj();
	
	    musicalnight.onSave(null);
	    musicalnight.read();
	    
	MusicalNightDto m=new MusicalNightDto();
	m.setPost("xxx");
	m.setPartyName("vv");
	m.setAtomosphere("good");
	m.setBestDjName("martin garrix");
	m.setBrandName("abc");
	m.setCollegeFest(false);
	m.setDate("16nov");
	m.setDay("sat");
	m.setDjName("ff");
	m.setEntryFeess(500);
	m.setFirstDjInWorld("jimmy savile");
	m.setGood(true);
	m.setGuestName(Guest.ORGANISERHEAD.toString());
	m.setIncomeOfDj(10000);
	m.setIndustryConnection(5);
	m.setLatestSong(50);
	m.setNumberOfContract(30);
	m.setNumberOfDj(19);
	m.setNumberOfEquipment(10);
	m.setOrganiserName("ggg");
	m.setPartyName("fun");
	m.setPlace("ban");
	m.setProfessional(true);
	m.setPubs(true);
	m.setTime(10.00);
	m.setTotalPeople(500);
	
	System.out.println(m.getPost());
	System.out.println(m.getPartyName());
	System.out.println(m.getAtomosphere());
	System.out.println(m.getBestDjName());
	System.out.println(m.getBrandName());
	System.out.println(m.isCollegeFest());
	System.out.println(m.getDate());
	System.out.println(m.getDay());
	System.out.println(m.getDjName());
	System.out.println(m.getEntryFeess());
	System.out.println(m.getFirstDjInWorld());
	System.out.println(m.isGood());
	System.out.println(m.getGuestName());
	System.out.println(m.getIncomeOfDj());
	System.out.println(m.getIndustryConnection());
	System.out.println(m.getLatestSong());
	System.out.println(m.getNumberOfContract());
	System.out.println(m.getNumberOfDj());
	System.out.println(m.getNumberOfEquipment());
	System.out.println(m.getOrganiserName());
	System.out.println(m.getPlace());
	System.out.println(m.getTime());
	System.out.println(m.getTotalPeople());
	System.out.println(m.isProfessional());
	System.out.println(m.isPubs());
	}

}
