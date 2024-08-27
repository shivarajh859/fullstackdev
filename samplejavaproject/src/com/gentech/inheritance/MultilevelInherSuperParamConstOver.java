
package com.gentech.inheritance;

class Employee2 {
    Employee2(String emName, int emNo, int sal) {
         
        System.out.println("Employee Name: " + emName);
        System.out.println("Employee NO: " + emNo);
        System.out.println("Employee Salary: " + sal);
    }
    Employee2(String emName,int emNo, int sal,String company, String job)
    {   
    	this(emName,emNo,sal);
    	System.out.println("Company Name: " + company);
        System.out.println("Job: " + job);
    }
}

class Employee2Address extends Employee2  {
    Employee2Address(String emName, int emNo, int sal,String company, String job,String city,String state, String country,int pincode) {
		super(emName,emNo,sal,company,job);		 
	        System.out.println("City Name: " + city);
	        System.out.println("State: " + state);
	        System.out.println("Country: " + country);
	        System.out.println("Pincode: " + pincode);
	}	              
}

public class MultilevelInherSuperParamConstOver {
    public static void main(String[] args) {
    	Employee2Address o=new Employee2Address("Kiran",100, 450000,"Amazon", "Manager","Bangalore",  "Karnataka","India",  560099);
    
    }
}
