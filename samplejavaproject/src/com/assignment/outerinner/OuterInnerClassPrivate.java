package com.assignment.outerinner;

class Employee
{
	String firstName;
	String job;
	EmployeeDetails o=new EmployeeDetails();
	private class EmployeeDetails
	{
		   int age;
		   int phoneNo;

	}
	void DisplayOutter()
	{		
		firstName="Santhosh";
		System.out.println("Name   :"+firstName);
		job="Manager";
		System.out.println("Job    :"+job);
	}
	public void DisplayInner() {
		 
		o.age=22;
		System.out.println("Age    :"+o.age);
		o.phoneNo=807548759;
		System.out.println("PhoneNO:"+o.phoneNo);
	}

}
public class OuterInnerClassPrivate {

	public static void main(String[] args) {
		Employee o=new Employee();
		o.DisplayOutter();
		o.DisplayInner();
		




	}

}
