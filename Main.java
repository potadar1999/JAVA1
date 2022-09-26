package com.Assi6;

public class Main {

	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.model = "Harrier";
		c1.companyName = "tata";
		c1.color = "black";
		c1.engine=new Engine();
		c1.engine.rmp = 10000;
		c1.engine.Power = 110;
		c1.engine.manufacturer = "tata";
		c1.engine.hasTurbo = true;
	

		System.out.println(c1.model);
		System.out.println(c1.companyName);
		System.out.println(c1.color);
		System.out.println(c1.engine.rmp);
		System.out.println(c1.engine.Power);
		System.out.println(c1.engine.manufacturer);
		System.out.println(c1.engine.hasTurbo);
		System.out.println("================================");
		
		
		
		
		Car c2=new Car("Nexon","TATA","White",new Engine());
		c2.engine.rmp = 10000;
		c2.engine.Power = 110;
		c2.engine.manufacturer = "tata";
		c2.engine.hasTurbo = false;
		
		
		System.out.println(c2.model);
		System.out.println(c2.companyName);
		System.out.println(c2.color);
		System.out.println(c2.engine.rmp);
		System.out.println(c2.engine.Power);
		System.out.println(c2.engine.manufacturer);
		System.out.println(c2.engine.hasTurbo);
		
		
	}

}
