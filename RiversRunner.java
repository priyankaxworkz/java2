package com.xworkz.test.driver;
import com.xworkz.test.things.Rivers;
public class RiversRunner {
	
	public static void main(String[] args) {
		String[] name= {"ganga","yamuna","kaveri","malaprabha"};
		Rivers.riverName(name);
		String[] place= {"gomukh","uttarnchal","karnataka","belgaum"};
		Rivers.riverName(name,place);
		String[] birthPlace= {"himalayanMountains","yamunothriGlacier","talakaveriBhrahamagiri","kanakumbi"};
		Rivers.riverName(name,place,birthPlace);
	}

}
