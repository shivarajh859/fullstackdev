package com.gentech.StaticInstancetest;
class Car 
{
	{
		String cname = "Benz";
		int Cno=100;
		System.out.println("Car Name:"+cname);
		System.out.println("Car Number id:"+Cno);		
	}
}
class Employee
{    
	String Ename  ;
	int id ;
	Employee(String Ename1,int id1)
	{
		Ename=Ename1;
		id=id1;		
		System.out.println("Person Name:"+Ename);
		System.out.println("Person id:"+id);	
	}
	Car o=new Car();

}
public class Test2TwoClass1InstanceMethodandConstructor {

	public static void main(String[] args) {
		Employee o=new Employee("Raju", 100);

	}

}
