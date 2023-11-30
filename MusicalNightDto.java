package com.xworkz.musicalnightdto;

public class MusicalNightDto {
	
	private String post;
	private String partyName;
	private String djName;
	private int numberOfDj;
	private int totalPeople;
	private int entryFeess;
	private boolean isGood;
	private double time;
	private String date;
	private String day;
	private String organiserName;
	private String guestName;
	private boolean isCollegeFest;
	private boolean isProfessional;
	private int latestSong;
	private int numberOfEquipment;
	private String atomosphere;
	private int incomeOfDj;
	private String firstDjInWorld;   
    private String bestDjName; 
    private String brandName;
    private int industryConnection;
    private int numberOfContract;
    private boolean isPubs;
    private String place;
    
    public MusicalNightDto() {
    	System.out.println("this is no arguments constructor");
    }
	public MusicalNightDto(String post, String partyName, String djName, int numberOfDj, int totalPeople,
			int entryFeess, boolean isGood, double time, String date, String day, String organiserName,
			String guestName, boolean isCollegeFest, boolean isProfessional, int latestSong, int numberOfEquipment,
			String atomosphere, int incomeOfDj, String firstDjInWorld, String bestDjName, String brandName,
			int industryConnection, int numberOfContract, boolean isPubs, String place) {
	
		this.post = post;
		this.partyName = partyName;
		this.djName = djName;
		this.numberOfDj = numberOfDj;
		this.totalPeople = totalPeople;
		this.entryFeess = entryFeess;
		this.isGood = isGood;
		this.time = time;
		this.date = date;
		this.day = day;
		this.organiserName = organiserName;
		this.guestName = guestName;
		this.isCollegeFest = isCollegeFest;
		this.isProfessional = isProfessional;
		this.latestSong = latestSong;
		this.numberOfEquipment = numberOfEquipment;
		this.atomosphere = atomosphere;
		this.incomeOfDj = incomeOfDj;
		this.firstDjInWorld = firstDjInWorld;
		this.bestDjName = bestDjName;
		this.brandName = brandName;
		this.industryConnection = industryConnection;
		this.numberOfContract = numberOfContract;
		this.isPubs = isPubs;
		this.place = place;
	}
		public void setPost(String post) {
		this.post = post;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public void setDjName(String djName) {
		this.djName = djName;
	}
	public void setNumberOfDj(int numberOfDj) {
		this.numberOfDj = numberOfDj;
	}
	public void setTotalPeople(int totalPeople) {
		this.totalPeople = totalPeople;
	}
	public void setEntryFeess(int entryFeess) {
		this.entryFeess = entryFeess;
	}
	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public void setOrganiserName(String organiserName) {
		this.organiserName = organiserName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public void setCollegeFest(boolean isCollegeFest) {
		this.isCollegeFest = isCollegeFest;
	}
	public void setProfessional(boolean isProfessional) {
		this.isProfessional = isProfessional;
	}
	public void setLatestSong(int latestSong) {
		this.latestSong = latestSong;
	}
	public void setNumberOfEquipment(int numberOfEquipment) {
		this.numberOfEquipment = numberOfEquipment;
	}
	public void setAtomosphere(String atomosphere) {
		this.atomosphere = atomosphere;
	}
	public void setIncomeOfDj(int incomeOfDj) {
		this.incomeOfDj = incomeOfDj;
	}
	public void setFirstDjInWorld(String firstDjInWorld) {
		this.firstDjInWorld = firstDjInWorld;
	}
	public void setBestDjName(String bestDjName) {
		this.bestDjName = bestDjName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public void setIndustryConnection(int industryConnection) {
		this.industryConnection = industryConnection;
	}
	public void setNumberOfContract(int numberOfContract) {
		this.numberOfContract = numberOfContract;
	}
	public void setPubs(boolean isPubs) {
		this.isPubs = isPubs;
	}
	public void setPlace(String place) {
		this.place = place;
	}
    
	public String getPost() {
		return post;
	}
	public String getPartyName() {
		return partyName;
	}
	public String getDjName() {
		return djName;
	}
	public int getNumberOfDj() {
		return numberOfDj;
	}
	public int getTotalPeople() {
		return totalPeople;
	}
	public int getEntryFeess() {
		return entryFeess;
	}
	public boolean isGood() {
		return isGood;
	}
	public double getTime() {
		return time;
	}
	public String getDate() {
		return date;
	}
	public String getDay() {
		return day;
	}
	public String getOrganiserName() {
		return organiserName;
	}
	public String getGuestName() {
		return guestName;
	}
	public boolean isCollegeFest() {
		return isCollegeFest;
	}
	public boolean isProfessional() {
		return isProfessional;
	}
	public int getLatestSong() {
		return latestSong;
	}
	public int getNumberOfEquipment() {
		return numberOfEquipment;
	}
	public String getAtomosphere() {
		return atomosphere;
	}
	public int getIncomeOfDj() {
		return incomeOfDj;
	}
	public String getFirstDjInWorld() {
		return firstDjInWorld;
	}
	public String getBestDjName() {
		return bestDjName;
	}
	public String getBrandName() {
		return brandName;
	}
	public int getIndustryConnection() {
		return industryConnection;
	}
	public int getNumberOfContract() {
		return numberOfContract;
	}
	public boolean isPubs() {
		return isPubs;
	}
	public String getPlace() {
		return place;
	}
	
	public String toString() {
		System.out.println("this is to string method");
		return "post";
	}
	@Override
	public int hashCode() {
		System.out.println("this is hash code method");
		return 200;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MusicalNightDto musicalnight=(MusicalNightDto)obj;
		if(this.post.equals(musicalnight.post)&&(this.partyName.equals(musicalnight.partyName)))
		return false;
		return true;
	}
	
}
