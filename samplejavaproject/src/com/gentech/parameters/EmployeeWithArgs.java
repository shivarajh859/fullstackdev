package com.gentech.parameters;

class Employee1
{
	String empName;
	int empNo;
	int salary;
	Employee1(String emName,int emNo,int sal)
	{
		empName=emName;
		empNo=emNo;
		salary=sal;
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
	Departments(String depName,int depNo)
	{
		deptName=depName;
		deptNo=depNo;

		System.out.println("Department Name:"+ deptName);
		System.out.println("Department NO:"+ deptNo);
		System.out.println("---------------------------");

	}

}
class Insurance
{
	String insuranceName;
	int insuranceNo;
	Insurance(String insName,int insNo)
	{  
		insuranceName=insName;
		insuranceNo=insNo;
		System.out.println("InsuranceName:"+insuranceName);
		System.out.println("InsuranceNo:"+insuranceNo);
	}
}
public class EmployeeWithArgs {

	public static void main(String[] args) {

		Employee1  emp=new Employee1("Santhos",200,20000);
		Employee1  emp1=new Employee1("Shivakumar",201,10000);
		Employee1  emp2=new Employee1("Kumar",202,1000);
		Departments dept=new Departments("Account",47);
		Departments dept1=new Departments("Research",70);
		Departments dept2=new Departments("Sales",40);
		Departments dept3=new Departments("Computer",70);
		Insurance ins=new Insurance("LIC",7878878);


	}

}
