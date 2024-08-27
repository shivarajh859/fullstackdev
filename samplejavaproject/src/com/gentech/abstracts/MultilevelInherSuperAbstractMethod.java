package com.gentech.abstracts;
abstract class Employee 
{
	abstract void employee(String ename, int eid);
}

class EmployeeJobDetails extends Employee 
{
	void employee(String ename, int eid) 
	{
		System.out.println("Employee Name: " + ename);
		System.out.println("Employee Id: " + eid);
	}

	void employeeJobDetails(String company, String job, int sal) 
	{
		System.out.println("Company Name: " + company);
		System.out.println("Job: " + job);
		System.out.println("Salary: " + sal);
	}
}

class EmployeeAddress extends EmployeeJobDetails 
{
	void address(String city, String state, String country, int pincode) 
	{
		System.out.println("City Name: " + city);
		System.out.println("State: " + state);
		System.out.println("Country: " + country);
		System.out.println("Pincode: " + pincode);
	}
}
public class MultilevelInherSuperAbstractMethod {
	public static void main(String[] args) {
		EmployeeAddress o = new EmployeeAddress();
		o.employee("Kiran", 100);
		o.employeeJobDetails("Amazon", "Manager", 2000);
		o.address("Bangalore", "Karnataka", "India", 560099);
	}
}

