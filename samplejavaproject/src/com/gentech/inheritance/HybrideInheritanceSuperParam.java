package com.gentech.inheritance;

class Customer1 
{
	Customer1(String name, int eid) 
	{
		System.out.println("Customer Name: " + name);
		System.out.println("Customer Id: " + eid);
	}
}

class Customer1JobDetails extends Customer1 
{
	Customer1JobDetails(String name, int eid, String company, String job, int sal) 
	{
		super(name, eid);
		System.out.println("Company Name: " + company);
		System.out.println("Job: " + job);
		System.out.println("Salary: " + sal);
	}
}

class Customer1Address extends Customer1JobDetails 
{
	Customer1Address(String name, int eid, String company, String job, int sal, String city, String state, String country, int pincode) 
	{
		super(name, eid, company, job, sal);
		System.out.println("City Name: " + city);
		System.out.println("State: " + state);
		System.out.println("Country: " + country);
		System.out.println("Pincode: " + pincode);
	}
}

class Customer1Contact extends Customer1Address 
{
	Customer1Contact(String name, int eid, String company, String job, int sal, String city, String state, String country, int pincode, String name1, int eid1, int phoneno, String email) 
	{
		super(name, eid, company, job, sal, city, state, country, pincode);
		System.out.println("Phone Number: " + phoneno);
		System.out.println("Email: " + email);
	}
}

public class HybrideInheritanceSuperParam {
	public static void main(String[] args) {
		Customer1JobDetails o1 = new Customer1JobDetails("Yashwanth", 190, "TCS", "Developer", 2000);
		System.out.println("----------------");
		Customer1Contact o = new Customer1Contact("Shivakumar", 1000, "Flipkart", "Analyst", 450000, "Bangalore", "Karnataka", "India", 560093, "Ravi", 100, 909080901, "kiran@gss.org");
	}
}
