package com.gentech.abstracts;
abstract class Person 
{	
	static class PersonDetails 
	{
		String personName;
		String job;
		int personId;
		void displayPersonDetails(String personName,String job, int personId) 
		{   
			System.out.println("Person Name: " + personName);
			System.out.println("Person Job: " + job);
			System.out.println("Person Id: " + personId);
		}
	}
	static class PersonAddress 
	{
		String country;
		String state;
		String city;
		int pincode;
		void displayPersonAddress(String country,String state,String city,int pincode) 
		{
			System.out.println("Country: " + country);
			System.out.println("State: " + state);
			System.out.println("City: " + city);
			System.out.println("Pincode: " + pincode);
		}
	}
	static class PersonContact 
	{
		String email;		 
		int phone;
		void displayPersonCotact(String email,int phone) 
		{	 
			System.out.println("Email: " + email);
			System.out.println("Phone Number: " +phone);			 
		}
	}
} 
public class AbstractMultipleStaticMethod {
	public static void main(String[] args) {
		Person.PersonAddress o=new Person.PersonAddress();
		Person.PersonDetails o1=new Person.PersonDetails();
		Person.PersonContact o3=new Person.PersonContact();
		o1.displayPersonDetails("Ambresh", "Manager", 100);
		o.displayPersonAddress("India", "Karnataka", "Bangalore", 560093);
		o3.displayPersonCotact("ambresh@gss.com", 976566560);
	}
}
