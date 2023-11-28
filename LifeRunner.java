package com.xworkz.life;

import com.xworkz.life.abstracts.Life;
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
	}
}
