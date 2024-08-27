package com.gentech.inheritance;
class Customer
{
	void customer(String name, int eid)
	{	 
		System.out.println("Customer Name:"+name);
		System.out.println("Customer Id:"+eid);
	}
}
class CustomerJobDetails extends Customer
{
	void customerJobDetails(String company,String job,int sal)
	{		  
		   System.out.println("Company Name:"+company);
		   System.out.println("Job:"+job);
		   System.out.println("Salary:"+sal);
	}
}
class CustomerAddress extends CustomerJobDetails
{
	void Address(String city,String state,String country,int pincode)
	{		 
		System.out.println("Ciyt Name:"+city);
		System.out.println("State:"+state);
		System.out.println("Country:"+country);
		System.out.println("Pincode:"+pincode);		
	}
}
class CustomerContact extends CustomerAddress
{
	void contact(int phoneno,String email)
	{
		System.out.println("Phone Number:"+phoneno);
		System.out.println("Email:"+email);
	}
}
public class HybrideInheritance {

	public static void main(String[] args) {
		CustomerJobDetails o=new CustomerJobDetails();
		o.customer("Shivakumar", 1000);
		o.customerJobDetails("Flipkart", "Analyst", 450000);
		System.out.println("-------------------");
		CustomerContact o1=new CustomerContact();
		o1.customer("Ravi", 100);
		o1.contact(909080901,"kiran@gss.org");		
		o1.customerJobDetails("Amazon", "Manager", 2000);
		o1.Address("Bangalore", "karnataka", "India", 560093);

	}

}
