package com.gentech.StaticInstancetest;
class OneInstanceStaticMethod
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
	static 
	{
		OneInstanceStaticMethod o=new OneInstanceStaticMethod();
		o.Student();
		o.Person(); 
	}
}
public class Test9 {

	public static void main(String[] args) {
		OneInstanceStaticMethod o=new OneInstanceStaticMethod();
	}

}
