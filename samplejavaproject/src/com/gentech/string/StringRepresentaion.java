package com.gentech.string;
class Employee
{
	 String name;
	 String age;
	 Employee(String name,String age)
	 {
		 this.name=name;
		 this.age=age;
	 }
	 @Override
	 public String toString()
	 {
		return "Name: "+name+" \nAge:"+age;
		 
	 }
} 
public class StringRepresentaion {

	public static void main(String[] args) {
		Employee o=new Employee("Raju", "78");
		System.out.println(o);
		 
		 
	}

}
