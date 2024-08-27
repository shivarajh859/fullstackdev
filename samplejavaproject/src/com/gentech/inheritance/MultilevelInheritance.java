package com.gentech.inheritance;
class Employee
{


	void employee(String ename, int eid)
	{
	 
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Id:"+eid);
	}
}
class EmployeeJobDetails extends Employee
{
	void employeeJobDetails(String company,String job,int sal)
	{
		  
		   System.out.println("Company Name:"+company);
		   System.out.println("Job:"+job);
		   System.out.println("Salary:"+sal);
	}
}
class EmpolyeeAdderss extends EmployeeJobDetails
{
	void Address(String city,String state,String country,int pincode)
	{
		 
		System.out.println("Ciyt Name:"+city);
		System.out.println("State:"+state);
		System.out.println("Country:"+country);
		System.out.println("Pincode:"+pincode);
		
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		EmpolyeeAdderss o=new EmpolyeeAdderss();
		o.employee("Kiran",100 );
        o.employeeJobDetails("Amazon", "Manager", 2000);
        o.Address("Bangalore", "karnataka", "India", 560099);

	}

}
