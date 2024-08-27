package com.gentech.StaticInstancetest;
class Person
{

	{
		String pname = "Raju";
		int id=100;
		System.out.println("Person Name:"+pname);
		System.out.println("Person id:"+id);
	}
	Person()
	{   
		String job="Developer";
		System.out.println("Job:"+job);
	}
}
public class Test1InstanceBlockNoArgsConstructor {

	public static void main(String[] args) {
		Person o=new Person();

	}

}
