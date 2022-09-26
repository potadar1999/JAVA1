package com.Assi6;


public class Car {
	
	String model;
	String companyName;
	String color;
	Engine engine;
	
	

	public Car() {
		super();
	}



	public Car(String model, String companyName, String color, Engine engine) {
		super();
		this.model = model;
		this.companyName = companyName;
		this.color = color;
		this.engine = new Engine();
	}

	


}
