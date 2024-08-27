package com.gentech.abstracts;

abstract class Employee2 
{
	Employee2(String emName, int emNo, int sal) 
	{
		System.out.println("Employee Name: " + emName);
		System.out.println("Employee NO: " + emNo);
		System.out.println("Employee Salary: " + sal);
	}

	Employee2(String emName, int emNo, int sal, String company, String job) 
	{
		System.out.println("Company Name: " + company);
		System.out.println("Job: " + job);
	}
}

class Employee2Address extends Employee2 
{
	Employee2Address(String emName, int emNo, int sal, String company, String job, 
			String city, String state, String country, int pincode) 
	{
		super(emName, emNo, sal, company, job);
		System.out.println("City Name: " + city);
		System.out.println("State: " + state);
		System.out.println("Country: " + country);
		System.out.println("Pincode: " + pincode);
	}
}
class Employee2Contact extends Employee2Address 
{
	Employee2Contact(String emName, int emNo, int sal, String company, String job,
			String city, String state,String country, int pincode,int phone,String email)
	{
		super(emName, emNo, sal, company, job, city, state, country, pincode);
		System.out.println("Phone Number: " +phone);
		System.out.println("Email: " + email);		 
	}
}
public class MultilevelInherSuperIsAbstractHasConstOver 
{
	public static void main(String[] args) {
		Employee2Contact o = new Employee2Contact("Kiran", 100, 450000, "Amazon", "Manager", 
				"Bangalore", "Karnataka", "India", 560099, 966357777, "kiran@gta.com");
	}
}
