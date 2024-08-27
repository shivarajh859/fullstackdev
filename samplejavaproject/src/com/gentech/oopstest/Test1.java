package com.gentech.oopstest;
class Employee
{ 
	String name;
	int id;
	Employee(String ename,int eid)
	{
		name=ename;
		id=eid;
		System.out.println("Employee name:"+name);
		System.out.println("Employee id:"+id);
	}
}
class EmployeeDetails extends Employee
{
	EmployeeDetails(String ename, int eid,int age,int sal) 
	{
		super(ename, eid);
		System.out.println("Employee Age:"+age);
		System.out.println("Employee salary:"+sal);	 

	}

}
class EmployeeAddress extends EmployeeDetails
{

	EmployeeAddress(String ename, int eid,int age,int sal) 
	{
		super(ename, eid,age, sal);

	}

}
public class Test1 {

	public static void main(String[] args) {
		EmployeeAddress o=new EmployeeAddress("Kumar", 1000, 24, 25000);


	}

}
