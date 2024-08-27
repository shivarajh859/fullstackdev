package com.gentech.polymorphism;
abstract class Person1
{
	abstract void display(); 
}
class Teacher extends  Person1
{
	void display()
	{	
		String name="Rajvire";
		int id=1001;
		System.out.println("Teacher Name:"+name);
		System.out.println("Teacher Id:"+id);
	}
}
class PrimeMinister extends Person1
{
	void display()
	{
		String name="Rajvire";
		int id=1001;
		System.out.println("PrimeMinister Name:"+name);
		System.out.println("PrimeMinister Id:"+id);
	}
}
class Employee extends Person1
{
	void display()
	{
		String name="Rajvire";
		int id=1001;
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Id:"+id);
	}
}
class Manager extends Person1
{
	void display()
	{
		String name="Rajvire";
		int id=1001;
		System.out.println("Manager Name:"+name);
		System.out.println("Manager Id:"+id);
	}
}
public class Person {
	public static void main(String[] args) {
		Person1 p=null;
		Teacher t=new Teacher();
		PrimeMinister pm=new PrimeMinister();
		Employee e=new Employee();
		Manager m=new Manager();
		
		p=t;
		p.display();
		p=pm;
		p.display();
		p=e;
		p.display();
		p=m;
		p.display();

	}

}
