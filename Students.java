package com.Assi6;

import java.util.jar.Attributes.Name;

public class Students {
	
	private int roll;
	private String name;
	private String address;
	private String collegeName;
	
	
	public Students() {
		super();
	}
	

	  public Students(int roll, String name, String address,String collegeName) {
			super();
			this.roll = roll;
			this.name = name;
			this.address = address;
			this.collegeName = collegeName;
		}
	
	
      public Students(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collegeName = "NIT";
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getCollegeName() {
		return collegeName;
	}


	public void setCollageName(String collegeName) {
		this.collegeName = collegeName;
	}

	
	

	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + ", address=" + address + ", collegeName=" + collegeName
				+ "]";
	}


	public static Students getStudent(boolean isFromNIT){
		if(isFromNIT){
			Students s1= new Students(23, "Anish", "vaishali");
			return s1;
		}
		else {
			Students s2=new Students(31, "Sandhya", "Karnataka", "KLE college");
			return s2;
		}
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students s1=getStudent(false);{
			System.out.println(s1);
		}
		
		Students s2=getStudent(true);{
			System.out.println(s2);
		}
//		
//		Students s1=new Students(); 
//		s1.setAddress("Bengaluru");
//		s1.setCollageName("NIT");
//		s1.setName("Abhi");
//		s1.setRoll(1);
//		
//		System.out.println(s1.getAddress());
//		System.out.println(s1.getCollageName());
//		System.out.println(s1.getName());
//		System.out.println(s1.getRoll());
//		
//		Students s2=new Students(); 
//		s2.setAddress("Pune");
//		s2.setCollageName("Shivaji");
//		s2.setName("Arun");
//		s2.setRoll(2);
//
//		
//		System.out.println(s2.getAddress());
//		System.out.println(s2.getCollageName());
//		System.out.println(s2.getName());
//		System.out.println(s2.getRoll());
	}

}
