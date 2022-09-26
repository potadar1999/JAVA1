package com.Assi6;

public class Demo {
	
	
	Demo(){
		this("Sandhya");
		System.out.println("I'm Demo");
	}
	Demo(String s){
		this(10);
		System.out.println(s);
		System.out.println("I'm Demo in the String");
	}
	Demo(int i){
		this(20f);
		System.out.println(i);
		System.out.println("I'm Demo in the integer");
    }
	Demo(float f){
		System.out.println(f);
		System.out.println("I'm Demo in the float");
	}

	public static void main(String[] args) {
		
		Demo d1=new Demo();
		
	
	}

}
