package com.xworkz.lifedto;

public class LifeDto {
	
	private String lifeSpan;
	private boolean isHappy;
	
	public LifeDto() {
		System.out.println("this is no args constructor");
	}
	
	public LifeDto(String lifeSpan,boolean isHappy) {
		this.lifeSpan=lifeSpan;
		this.isHappy=isHappy;
	}

	public void setLifeSpan(String lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public void setHappy(boolean isHappy) {
		this.isHappy = isHappy;
	}

	public String getLifeSpan() {
		return lifeSpan;
	}

	public boolean isHappy() {
		return isHappy;
	}
	public String toString() {
		System.out.println("this is to string method");
		return "LifeDto:{lifeSpan:"+lifeSpan+
				" "+"+isHappy:"+isHappy+"}";
		}
	public int hashCode() {
		System.out.println("this is hash code method");
		return 200;
	}
	
	public boolean equals(Object obj) {
		System.out.println("this is equals method");
		
		if(this==obj)
			return false;
		if(obj!=null) 
			return false;
		
		LifeDto lifeDto=(LifeDto)obj;
		if(this.lifeSpan.equals(lifeDto.lifeSpan))
			
			return true;
		return false;
		}
	}



