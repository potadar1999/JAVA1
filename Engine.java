package com.Assi6;

public class Engine {

	
	int rmp;
	int Power;
	String manufacturer;
	boolean hasTurbo;

	public boolean turbo(boolean hasTurbo) {
		if(hasTurbo==false) {
			return false;
		}
		else {
			return true;
		}
	}
	
}
