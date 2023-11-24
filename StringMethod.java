package com.xworkz.interview.driver;

public class StringMethod {
	
	public static void main(String[] args) {
	String s1="sapthasagarda acche ello";
	
	System.out.println("senetnce length is:"+s1.length());
	
	String[] name=s1.split(" ");
	System.out.println("split sentence is:"+name.length);
	
	for(String w:name) {
		System.out.println("word is:"+w);
	}
	
	char[] ch=s1.toCharArray();
	System.out.println("char is:"+ch.length);
	for(int i=0;i<ch.length;i++) {
		System.out.println("sentence is:"+ch[i]);
	}
	
	System.out.println(s1.substring(2));
		
	System.out.println(s1.substring(2, 5));
	
	System.out.println(s1.charAt(3));
	
	String s2=s1.toLowerCase();
	System.out.println(s2);
	
	String s3=s1.toUpperCase();
	System.out.println(s3);
	
	String s4=s1.replace('s', 'a');
	System.out.println(s4);
	
	String s5=s1.concat("hello");
	System.out.println(s5);
	
	String s6=s1.repeat(2);
	System.out.println(s6);
	
	String s7=s1.trim();
	System.out.println(s7);
	
	String s8=s1.intern();
	System.out.println(s8);
	
	System.out.println(s1.equals(s1));
	
	String s9=s1.replace(s2, s3);
	System.out.println(s9);
	
	
	String word="hello im here to meet you";
	
	char[] ch1=word.toCharArray();
	System.out.println(ch1.length);
	
	for(int j=ch1.length-1;j>=0;j--) {
		System.out.print(ch1[j]);
	}
	
	String sentence="hey this is good time to go to trip";
	
	System.out.println("senetnce is:"+sentence);
	
	String name1="CAN I HELP  YOU";
	System.out.println("name 1 is:"+name1);
	
	String n=name1.replace('C','c');
	String n1=name1.replace('I', 'i');
	String n2=name1.replace('H', 'h');
	String n3=name1.replace('Y', 'y');
    System.out.println("name:"+n+""+n1+" "+n2+" "+n3);
    
    String m1=s1.indent(10);
    System.out.println("indent is:"+m1);
    
    String m2=s1.replaceAll(s9, s8);
    System.out.println("replace all:"+m2);
    
    String m3=name1.strip();
    System.out.println(m3);
    
    System.out.println(s1.isEmpty());
    
    System.out.println(s1.endsWith(s1));
    
    System.out.println(s1.contentEquals(s1));
    
    System.out.println(s1.contains("ello"));
    
    System.out.println(s1.contains("yello"));
    
    System.out.println(s1.compareTo(name1));
    
    
	}
	
	
	}


