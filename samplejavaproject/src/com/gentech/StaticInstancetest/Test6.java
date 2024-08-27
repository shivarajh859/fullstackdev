package com.gentech.StaticInstancetest;
class Car1 
{
	static
	{
		String cname = "Benz";
		int Cno=100;
		System.out.println("Car Name:"+cname);
		System.out.println("Car Number id:"+Cno);
	}
}
class Employee1  
{    
	static 
	{   
		String Ename="Kumar";
		int id=300;		
		System.out.println("Person Name:"+Ename);
		System.out.println("Person id:"+id);
		Car1 o=new Car1();
	}
}
public class Test6 {

	public static void main(String[] args) {
		Car o=new Car();
		Employee1 o1=new Employee1();


	}

}

