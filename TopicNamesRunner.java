package com.xworkz.test.driver;

import com.xworkz.test.things.TopicNames;

public class TopicNamesRunner {
	
	public static void main(String[] args) {
		TopicNames topicNames= new TopicNames();
		
		topicNames.names("array");
		topicNames.names("variables");
		topicNames.names("metods");
		topicNames.names("dataTypes");
		topicNames.names("operators");
		
		topicNames.getNames();
	}

}
