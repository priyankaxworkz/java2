package com.xworkz.Shopping.driver;

import com.xworkz.Shopping.things.Bus;
import com.xworkz.Shopping.things.Manufacture;
import com.xworkz.Shopping.things.Transfort;

public class TransportRunner {

	public static void main(String[] args) {
		 Transfort t=new Transfort();
		 t.name="bus";
		 t.price=500000;
		 System.out.println(t.name);
		 System.out.println(t.price);
		 
		 Bus b=new Bus();
		 b.busName="airavtaha";
		 b.busPrice=500000;
		 System.out.println(b.busName);
		 System.out.println(b.busPrice);
		 
		 Manufacture m=new Manufacture();
		 m.enginePrice=40000;
		 m.model="hgy";
		 
		 System.out.println(m.enginePrice);
		 System.out.println(m.model);
		 
		 
		 
	}
}
