package com.gentech.oopstest;
abstract class Employee1
{
	abstract void display();
}

interface Address
{
	void displayaddress();
}
interface Contact
{
	void displaycontact();
}
class Employee1Details  extends Employee1 implements Address,Contact
{
	String personName = "Rakesh";
    String job = "Data Analyst";
    int personId = 80889;
    void display() 
    {
    	System.out.println("Person Name: " + personName);
        System.out.println("Person Job: " + job);
        System.out.println("Person Id: " + personId);
        System.err.println("--------------");
    }
	@Override
	public void displaycontact() 
	{
		int phone=989373887;
		System.out.println("Phone Number:"+phone);
	}
	@Override
	public void displayaddress() 
	{
	    String address=" #15  2nd main road Attiguppe ";
	    System.out.println("Address:"+address);
		
	}
    
}
class EmployeeContact extends  Employee1Details
{

	
}
public class Test2 {

	public static void main(String[] args) 
	{
		EmployeeContact o=new EmployeeContact();
		o.display();
		o.displayaddress();
		o.displaycontact();

	}

}
