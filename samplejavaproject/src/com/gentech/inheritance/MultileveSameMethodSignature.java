package com.gentech.inheritance;
class Invoice
{ 	 
	void display(String name,String email,int id)
	{
		System.out.println("Coustomer Name:"+name);
		System.out.println("Email:"+email);
		System.out.println("Customer Id:"+id);
		System.out.println("1-------------------");
	}
}
class Invoice1 extends Invoice
{ 
	Invoice1(String name,String email,int id)
	{
		super.display(name, email, id);   
	}
	void display(String name2,String email2,int id2)
	{		
		System.out.println("Coustomer Name:"+name2);
		System.out.println("Email:"+email2);
		System.out.println("Customer Id:"+id2);
		System.out.println("2-------------------");
	}
}
class Invoice2 extends Invoice1
{   
	Invoice2(String name,String email,int id)
	{  
		super(name,email,id);
		super.display(email,name,id);
	}
	void display(String name,String email,int id)
	{
		System.out.println("Coustomer Name:"+name);
		System.out.println("Email:"+email);
		System.out.println("Customer Id:"+id);
		System.out.println("3-------------");      
	}
}
public class MultileveSameMethodSignature {
	public static void main(String[] args) {
		Invoice2 o=new Invoice2("Rakesh","rakesh@gta.com",98);
		o.display("Kalmesh","rakesh@gta.com",99);

	}

}
