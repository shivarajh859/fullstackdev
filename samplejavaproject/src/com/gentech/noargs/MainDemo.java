package com.gentech.noargs;

class Employee1
{
	String empName;
	int empNo;
	int salary;
	Employee1()
	{
		empName="Santhos";
		empNo=200;
		salary=50000;
		System.out.println("Employee Name:"+ empName);
		System.out.println("Employee NO:"+empNo);
		System.out.println("Employee Salary:"+salary);
		System.out.println("---------------------------");		
	}

}
class Departments
{
	String deptName;
	int deptNo;
	Departments()
	{
		deptName="Account";
		deptNo=47;
		System.out.println("Department Name:"+ deptName);
		System.out.println("Department NO:"+ deptNo);
		System.out.println("---------------------------");
	}

}
class Insurance
{
	String insuranceName;
	int insuranceNo;
	String insuranceduedate;
	Insurance()
	{
		insuranceName="LIC";
		insuranceNo=7878878;
		insuranceduedate="20-12-2025";
		System.out.println("InsuranceName:"+insuranceName);
		System.out.println("InsuranceNo:"+insuranceNo);
		System.out.println("Insurance due date"+insuranceduedate);
		
	}
}
public class MainDemo {

	public static void main(String[] args) {

		Employee1  emp=new Employee1();
		Departments dept=new Departments();
		Insurance ins=new Insurance();


	}

}
