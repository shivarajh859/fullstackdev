package com.gentech.programs;


class Employee1
{
	String empName;
	int empNo;
}
class Departments
{
	String deptName;
	int deptNo;
}
class Insurance
{
	String insuranceName;
	int insuranceNo;
}
public class Employee {
	public static void main(String[] args) {
		Employee1 emp=new Employee1();
		emp.empName="Shivaraj";
		emp.empNo=440;
		System.out.println("Employee Name:"+emp.empName);
		System.out.println("Employee NO:"+emp.empNo);
		System.out.println("---------------------------");	
		Departments dept=new Departments();
		dept.deptName="Account";
		dept.deptNo=2;
		System.out.println("Department Name:"+dept.deptName);
		System.out.println("Department NO:"+dept.deptNo);
		System.out.println("---------------------------");
		Insurance ins=new Insurance();
		ins.insuranceName="LIC";
		ins.insuranceNo=7878878;
		System.out.println("InsuranceName:"+ins.insuranceName);
		System.out.println("InsuranceNo:"+ins.insuranceNo);



	}

}
