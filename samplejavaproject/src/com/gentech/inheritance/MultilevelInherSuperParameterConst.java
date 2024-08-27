package com.gentech.inheritance;
class Employee1
{

	Employee1(String emName,int emNo,int sal)
	{

		System.out.println("Employee Name:"+ emName);
		System.out.println("Employee NO:"+emNo);
		System.out.println("Employee Salary:"+sal);

	}

}
class Employee1JobDetails extends Employee1
{


	Employee1JobDetails(String emName, int emNo, int sal,String company,String job) {
		super(emName, emNo, sal);
		System.out.println("Company Name:"+company);
		System.out.println("Job:"+job);

	}

}
class Empolyee1Adderss extends EmployeeJobDetails
{

	void Address(String city,String state,String country,int pincode)
	{

		System.out.println("Ciyt Name:"+city);
		System.out.println("State:"+state);
		System.out.println("Country:"+country);
		System.out.println("Pincode:"+pincode);

	} 

}
public class MultilevelInherSuperParameterConst {

	public static void main(String[] args) {
		Empolyee1Adderss o=new Empolyee1Adderss();	 
		o.employeeJobDetails("Amazon", "Manager", 2000);
		o.Address("Bangalore", "karnataka", "India", 560099);
		Employee1JobDetails o1=new Employee1JobDetails("Rakesh", 1001, 45000, "Amazon", "Developer");

	}

}
