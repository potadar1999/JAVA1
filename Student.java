package com.Assi6;

import java.util.jar.Attributes.Name;

public class Student {
	
	private int roll;
	private String name;
	private int age;
	private int marks;
	
     public Student(){
    	 
     }
     
     public Student(int roll,String name, int age, int marks){
    	 this.roll=roll;
    	 this.name=name;
    	 this.age=age;
    	 this.marks=marks;
    	
     }
     
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=49;
		int marks=450;
		
//		if(age>18 && age<60 && marks>0 && marks<500) {
//			Student Stu1=new Student(1, "abhi", age, marks);
////			System.out.println(Stu1);
//			System.out.println("Roll Num = "+Stu1.getRoll());
//			System.out.println("Name = "+Stu1.getName());
//			System.out.println("Age = "+Stu1.getAge());
//			System.out.println("Marks = "+Stu1.getMarks());
//		}
//		else {
//			Student Stu2=new Student();
//
//			System.out.println("Roll Num = "+Stu2.getRoll());
//			System.out.println("Name = "+Stu2.getName());
//			System.out.println("Age = "+Stu2.getAge());
//			System.out.println("Marks = "+Stu2.getMarks());
//			
//			
//		}
		
		if(age>18 && age<60 && marks>0 && marks<500) {
			Student Stu1=new Student(1, "abhi", age, marks);
			System.out.println(Stu1);
			
		}
		else {
			Student Stu2=new Student();
			System.out.println(Stu2);
		
			
			
		}

		
		
		
		
		
		
		

	}

}
