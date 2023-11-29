package com.xworkz.lifeimple;

import com.xworkz.life.abstracts.Life;
import com.xworkz.lifedto.LifeDto;

public class HumanLife extends Life {
	
	public void savings() {
		System.out.println("this is savings method");
	}
	
	public void job() {
		System.out.println("the job method");
	}
	
	public void benefits() {
		System.out.println("this is benefits method");
	}
	
	public void friends() {
		System.out.println("this is friends method");
	}
	
	public void health() {
		System.out.println("this is health method");
		}
	
	public void family() {
		System.out.println("this is family method");
	}
	
	public void education() {
		System.out.println("this is education method");
	}
	
	public void lifeInsurance() {
		System.out.println("this is insurance method");
	}
	
	public void happiness() {
		System.out.println("this is happiness method");
	}
	
	public void roles() {
		System.out.println("this is roles method");
	}
	
	Object[] obj=new Object[1];
	int index=0;

	public boolean onSave(LifeDto lifeDto) {
		if(lifeDto!=null) {
			System.out.println("dto is not null");
			
			if(index<obj.length) {
				obj[index]=lifeDto;
				index++;
			}
		}else {
			System.out.println("dto is null");
		}
		return false;
	}
}
