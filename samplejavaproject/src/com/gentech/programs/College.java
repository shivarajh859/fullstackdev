package com.gentech.programs;
class Student
{
	String stdName;
	int stdId;
	String branch;
}
class Library
{
	String libName;
	String libBookName;
}
class Sports
{
	String sportsName;
	String couchName;
	String sportsItems;

}
class Computerlab
{  
	String ComputerlabTeacher;
	String computerlabNo;

}

public class College {

	public static void main(String[] args) {
		Student s=new Student();
		s.stdName="Raju";
		s.stdId=100;
		s.branch="CSE";
		System.out.println("Student Name:"+s.stdName);
		System.out.println("Student Id:"+s.stdId);
		System.out.println("Student branch:"+s.branch);
		System.out.println("----------------------");
		Library l=new Library();
		l.libName="Sir M Vishveshwaraya Library";
		l.libBookName="Java Book";
		System.out.println("Library Name:"+l.libName);
		System.out.println(" Book Name:"+l.libBookName);
		System.out.println("----------------------");
		Sports sp=new Sports();
		sp.sportsName="Cricket";
		sp.sportsItems=("Bat , Ball");
		sp.couchName="Kiran";
		System.out.println("Sports Name:"+sp.sportsName);
		System.out.println("Sports Items:"+sp.sportsItems);
		System.out.println("couchName:"+sp.couchName);
		System.out.println("----------------------");
		Computerlab c=new Computerlab();
		c.ComputerlabTeacher="Ravi";
		c.computerlabNo="8989";
		System.out.println("Computerlab Teacher Name:"+c.ComputerlabTeacher);
		System.out.println("Computerlab Number:"+c.computerlabNo);





	}

}
