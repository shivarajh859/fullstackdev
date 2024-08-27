package com.gentech.noargs;
class Student
{
	String stdName;
	int stdId;
	String branch;
	int sem;
	Student()
	{
		stdName="Raju";
		stdId=100;
		branch="CSE";
		sem=3;
		System.out.println("Student Name:"+ stdName);
		System.out.println("Student Id:"+ stdId);
		System.out.println("Student branch:"+ branch);
		System.out.println("Semester"+sem);
		System.out.println("----------------------");
	}
}
class Library
{
	String libName;
	String libBookName;
	int libBookNo;
	Library()
	{
		libName="Sir M Vishveshwaraya Library";
		libBookName="Java Book";
		libBookNo=670;
		System.out.println("Library Name:"+ libName);
		System.out.println(" Book Name:"+ libBookName);
		System.out.println("Library BookNo"+libBookNo);
		System.out.println("----------------------");
	}
}
class Sports
{
	String sportsName;
	String couchName;
	String sportsItems;
	Sports()
	{
		sportsName="Cricket";
		sportsItems=("Bat , Ball");
		couchName="Kiran";
		System.out.println("Sports Name:"+ sportsName);
		System.out.println("Sports Items:"+ sportsItems);
		System.out.println("couchName:"+ couchName);
		System.out.println("----------------------");
	}

}
class Computerlab
{  
	String ComputerlabTeacher;
	String computerlabNo;
	String computerlabTime;
	Computerlab()
	{
		ComputerlabTeacher="Ravi";
		computerlabNo="8989";
		computerlabTime="02:30:00 PM";
		System.out.println("Computerlab Teacher Name:"+ ComputerlabTeacher);
		System.out.println("Computerlab Number:"+ computerlabNo);
		System.out.println("computerlabTime:"+computerlabTime);
	}

}
public class Collegenoargs {

	public static void main(String[] args) {

		Student s=new Student();
		Library l=new Library();
		Sports sp=new Sports();
		Computerlab c=new Computerlab();
	}

}
