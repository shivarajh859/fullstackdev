package com.gentech.StaticInstancetest;
class Person1
{   
	String cname = "Benz";
    int Cno=100;
	{	
		System.out.println("Car Name:"+cname);
		System.out.println("Car Number id:"+Cno);
	}
	 
	static String job = "Developer";
	static int phone=999787342;
	{	
		System.out.println("JOb Name:"+job);
		System.out.println("Phone Number id:"+phone);
	}
}
class Person2 
{
	Person2()
	{
		System.out.println("Hi");
		Person1 o=new Person1();
	}
	
}
public class Test3TwoInstanceVariableTwoStaticVariable {
	public static void main(String[] args) {
		Person2 o=new Person2();		
	}

}
