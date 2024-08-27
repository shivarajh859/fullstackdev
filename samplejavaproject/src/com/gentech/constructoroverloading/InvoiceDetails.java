package com.gentech.constructoroverloading;
class Invoice
{ 
	Invoice(String name,String email,int id)
	{
		
		System.out.println("Coustomer Name:"+name);
		System.out.println("Email:"+email);
		System.out.println("Customer Id:"+id);

	}
	Invoice(int amount,int phone)
	{	 
		System.out.println("Amount:"+amount);
		System.out.println("Phone No:"+phone);

	}
	Invoice(String date,int quntity,String retAddress)
	{	 
		System.out.println("Date Of Delivary:"+date);
		System.out.println("Quntity of product:"+quntity);
		System.out.println("Return Address:"+retAddress);
		

	} 
	Invoice(int pincode,String address,String state)
	{	 
		System.out.println("Address:"+address);
		System.out.println("Pincode:"+pincode);	
		System.out.println("State"+state);
	}
}
public class InvoiceDetails {

	public static void main(String args[]) {
		Invoice o1=new Invoice("Rakesh","rakesh@gta.com",98);
		Invoice o2=new Invoice(500,958875875);
		Invoice o3=new Invoice("24-09-2024",800,"Vijayanagar");
		Invoice o4=new Invoice(560097,"C V Ramanagar","Karnataka");
	}


}
