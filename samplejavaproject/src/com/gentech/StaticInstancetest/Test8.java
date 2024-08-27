package com.gentech.StaticInstancetest;
class InstanceMethod
{
	void Student()
	{
		String sname="RAj";
		int rollno=8787;
		System.out.println("Student Name:"+sname);
		System.out.println("Roll No:"+rollno);
	}
	{
		String name="Kishor";
		int roll=1000;
		System.out.println("Student Name:"+name);
		System.out.println("Roll No:"+roll);
		Student();
	}		

}
public class Test8 {
	public static void main(String[] args) {
		InstanceMethod o=new InstanceMethod();		
	}

}
