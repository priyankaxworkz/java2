package com.xworkz.test.driver;

import com.xworkz.test.things.Snapchat;

public class SnapchatRunner {
	public static void main(String[] args) {
		Snapchat snapchat=new Snapchat();
		snapchat.getFollowers();
		snapchat.getFollowersNumber(12,34);
		snapchat.getStrikeNumber(34,56,7);
		snapchat.getFollowerName("vcn","ghg");
		snapchat.getTotalAvatars((byte)23,(byte)45);
		snapchat.getRequestSuggested((short)345,(short)567);
		snapchat.getFilters(456,345);
		snapchat.getStory(12,23);
		snapchat.getPassword(23,34);
		snapchat.getClarity(true,true);
	}

}
