package com.gentech.practice;

abstract class Employee
{
	  abstract void employee(String name,String job,int sal);
}
class EmployeeAddress extends Employee
{
	String state;
	String city;
	int area;
	void employee(String name, String job, int sal) 
	{
		System.out.println("Name:"+name);
		System.out.println("Job:"+job);
		System.out.println("Salary:"+sal);
	}

	static void displayaddress(String state,String city,String area) 
	{
		System.out.println("State:"+state);
		System.out.println("City:"+city);
		System.out.println("Area:"+area);		
	}
}
class EmployeeContact extends EmployeeAddress
{
	static void displaycontact(String email,String phone) 
	{
		System.out.println("Email:"+email);
		System.out.println("Phone Number:"+phone);
	}
}
public class AbstractMultipleStaticMethod {
	public static void main(String[] args) {
		 
		EmployeeContact o=new EmployeeContact();
		o.employee("Ramesh", "Manager", 80000);
		o.displayaddress("Karnataka", "Bngalore", "Vijaynagara");
		o.displaycontact("ramrsk@gss.com", "767-767-8999");


	}

}

