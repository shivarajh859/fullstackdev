package com.gentech.constructoroverloading;
class User
{ 
	User(String name, String email, int sal)
	{

		System.out.println("User Name:"+name);
		System.out.println("Email Name:"+email);
		System.out.println("User Salary:"+sal);

	}
	User(int id,int age,int phone)
	{	 System.out.println("User Id:"+id);
		System.out.println("Age:"+age);
		System.out.println("Phone No:"+phone);

	}
	User(String dob,int uid,String pasw)
	{	 
		System.out.println("Date of Birth:"+dob);
		System.out.println("Usre Id:"+uid);
		System.out.println("Password:"+pasw);

	} 
	User(int pincode,String address,String state)
	{	 
		System.out.println("Address :"+address);
		System.out.println("Pincode:"+pincode);
		System.out.println("State:"+state);
	}
}

public class UserProfile {
	public static void main(String args[]) {

		User o1=new User("Shivaraj","shivaraj@gta.com",20000);
		User o2=new User(28,989899898,9899);
		User o3=new User("20-12-1999",100,"shiw7848");
		User o4=new User(560003,"Attiguppe","Karnataka");
	}

}
