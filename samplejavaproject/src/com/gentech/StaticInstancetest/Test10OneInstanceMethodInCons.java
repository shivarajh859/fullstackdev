package com.gentech.StaticInstancetest;
class OneInstanceMethodInCons
{
	void Student()
	{
		String sname="RAj";
		int rollno=8787;
		System.out.println("Student Name:"+sname);
		System.out.println("Roll No:"+rollno);

	}
	static void Person()
	{		   
		String pname="";
		int id=300;		
		System.out.println("Person Name:"+pname);
		System.out.println("Person id:"+id);
	}
	OneInstanceMethodInCons()
	{
		Student();
		Person(); 
	}
}
public class Test10OneInstanceMethodInCons {
	public static void main(String[] args) {
		OneInstanceMethodInCons o=new OneInstanceMethodInCons();
	}

}

