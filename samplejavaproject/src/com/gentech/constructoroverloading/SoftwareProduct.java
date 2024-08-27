package com.gentech.constructoroverloading;
class Software
{ 
	Software(String name,double ver)
	{

		System.out.println("Software Name:"+name);
		System.out.println("version:"+ver);

	}
	Software(int amount,int phone)
	{	 
		System.out.println("Amount:"+amount);
		System.out.println("Phone No:"+phone);

	}
	Software(String releaseDate,int licenseDuration,String rating)
	{	 
		System.out.println("Release of Date:"+releaseDate);
		System.out.println("License Duration:"+licenseDuration);
		System.out.println("Rating of Software:"+rating);

	} 
	Software(int pincode,String address,String country,String state)
	{	 
		System.out.println("Address:"+address);
		System.out.println("Pincode:"+pincode);	
		System.out.println("Country:"+country);
		System.out.println("State:"+state);
	}
}

public class SoftwareProduct {

	public static void main(String[] args) {
		Software o1=new Software("Microsoft Office",14.1);
		Software o2=new Software(500,958875875);
		Software o3=new Software("24-09-2024",10,"4.5");
		Software o4=new Software(560097,"K R Pura","India","Karnataka");
	}

}
