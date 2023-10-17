package com.xworkz.test.things;

public class TopicNames {

	int index=0;

	String[] topicList = new String[5];

	public void names(String topicNames) {

		if (index<topicList.length) {
			topicList[index] = topicNames;
			System.out.println("array of the length is:"+index);
			System.out.println("array of the length is:"+topicList[index]);
			index++;
			
		} else {
			System.out.println("array is full");
		}

	}

	public void getNames() {
		for (int i = 0; i < topicList.length; i++) {
			System.out.println(topicList[i]);
		}
	}

}
