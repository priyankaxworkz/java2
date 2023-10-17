package com.xworkz.test.things;

public class Snapchat {
	
	public String userName;
	public int password;
	public long contactNumber;
	public String emailid;
	public byte strike;
	public short follower;
	
	public Snapchat() {
		System.out.println("this is no arguments constructor");
	}

	public Snapchat(String userName,int password,long contactNumber,String emailid,byte strike,short follower) {
		this.userName=userName;
		this.password=password;
		this.contactNumber=contactNumber;
		this.emailid=emailid;
		this.strike=strike;
		this.follower=follower;
	}
	public void getFollowers() {
		this.getFollowersNumber(45);
		System.out.println("this is get followers from snapchat");
	}
	public void getFollowersNumber(int...followerNumber) {
		System.out.println("followerNumber is:"+followerNumber.length);
		for(int i=0;i<followerNumber.length;i++) {
			System.out.println(followerNumber[i]);
		}
	}
	public void getStrikeNumber(int...strikeNumber) {
		System.out.println("strikeNumber is:"+strikeNumber.length);
		for(int a=0;a<strikeNumber.length;a++) {
			System.out.println(strikeNumber[a]);
		}
	}
	public void getFollowerName(String...followerName) {
		System.out.println("followername is:"+followerName.length);
		for(int m=0;m<followerName.length;m++) {
		System.out.println(followerName[m]);	
			}
	}
	public void getTotalAvatars(byte... totalAvatars) {
		System.out.println("total avatars is:"+totalAvatars.length);
		for(int p=0;p<totalAvatars.length;p++) {
			System.out.println(totalAvatars[p]);
		}
	}
	public void getRequestSuggested(short...numberOfRequest) {
		System.out.println("number of requsted suggested:"+numberOfRequest.length);
	for(int t=0;t<numberOfRequest.length;t++) {
	System.out.println(numberOfRequest[t]);
	}
	}
	public void getFilters(int...numberOfFilters) {
	System.out.println("number of filter is:"+numberOfFilters.length);
	for(int z=0;z<numberOfFilters.length;z++) {
		System.out.println("numberOfFilters[z]");
	}
	}
	public void getStory(int... numberOfStory) {
		System.out.println("number of story:"+numberOfStory.length);
		for(int r=0;r<numberOfStory.length;r++) {
			System.out.println(numberOfStory[r]);
	}
	}
	public void getPassword(int... password) {
		System.out.println("password is:"+password.length);
		for(int e=0;e<password.length;e++) {
			System.out.println(password[e]);
		}
	}
	public void getClarity(boolean...isClarity) {
		System.out.println("clarity is:"+isClarity.length);
		for(int q=0;q<isClarity.length;q++) {
			System.out.println(isClarity[q]);
		}
	}
}
