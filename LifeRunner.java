package com.xworkz.life;

import com.xworkz.life.abstracts.Life;
import com.xworkz.lifedto.LifeDto;
import com.xworkz.lifeimple.HumanLife;

public class LifeRunner {

	public static void main(String[] args) {
		
		Life life=new HumanLife();
		
		life.family();
		life.benefits();
		life.education();
		life.friends();
		life.happiness();
		life.health();
		life.job();
		life.lifeInsurance();
		life.roles();
		life.savings();
		
		life.onSave(null);
		
		LifeDto lifeDto=new LifeDto();
		lifeDto.setLifeSpan("60yr");
		lifeDto.setHappy(false);
		
		System.out.println(lifeDto.getLifeSpan());
		System.out.println(lifeDto.isHappy());
		
		System.out.println(lifeDto.toString());
		System.out.println(lifeDto.hashCode());
		System.out.println(lifeDto.equals(lifeDto));
	}
}
