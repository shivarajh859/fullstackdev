package com.assignment.outerinner;
class Person
{   
	int age;
	int phone;
	static class PersonDetalis
	{
		String PersonName;
		String job;
		int  PersonId;

	}
	static class PersonAddress
	{
		String country;
		String state;
		String city;
		int pincode;
		
	}
	void displayPerson()
	{
		int age=23;
		int phone=70089849;
		System.out.println("Age:"+age);
		System.out.println("Phone:"+phone);
		
	}
	void displayPersonDetalis()
	{
		String PersonName="Kiran";
		String job="Accountant";
		int PersonId=80883;
		System.out.println("Person Name:"+PersonName);
		System.out.println("Person Job:"+job);
		System.out.println("Person Id:"+PersonId);

	}
	void displayPersonAddress()
	{
		String country="India";
		String state="Karnataka";
		String city="Bangalore";
		int pincode=560093;
		System.out.println("Country:"+country);
		System.out.println("State:"+state);
		System.out.println("City:"+city);
		System.out.println("Pincode:"+pincode);

	}
}
public class Outer2InnerStatic {
	public static void main(String args[]) {
		Person o=new Person();		
		o.displayPersonDetalis();
		o.displayPersonAddress();
		o.displayPerson();
	}

}
