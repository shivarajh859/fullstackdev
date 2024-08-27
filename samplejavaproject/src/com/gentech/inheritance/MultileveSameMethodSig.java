package com.gentech.inheritance;
class Invoice20 
{
	void display(String name, String email, int id) 
	{
		System.out.println("Customer Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Customer Id: " + id);
		System.out.println("1-------------------");
	}
}
class Invoice21 extends Invoice20 
{
	Invoice21(String name, String email, int id) 
	{
		super.display(name, email, id);
	}
	void display(String name2, String email2, int id2) 
	{
		System.out.println("Customer Name: " + name2);
		System.out.println("Email: " + email2);
		System.out.println("Customer Id: " + id2);
		System.out.println("2-------------------");
	}
}
class Invoice22 extends Invoice21 
{
	Invoice22(String name, String email, int id) 
	{
		super(name, email, id);
	}

	void display(String name, String email, int id) 
	{
		System.out.println("Customer Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Customer Id: " + id);
		System.out.println("3-------------");
	}
}
public class MultileveSameMethodSig {
	public static void main(String[] args) {
		Invoice22 o = new Invoice22("Rakesh", "rakesh@gta.com", 98);
		o.display("Ramesh", "invoice@gta.com", 101);
		o.display("Kalmesh", "invoice1@gta.com", 102);
		o.display("Umesh", "invoice2@gta.com", 103);
	}
}

