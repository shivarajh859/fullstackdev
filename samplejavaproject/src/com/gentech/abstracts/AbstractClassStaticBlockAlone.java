 package com.gentech.abstracts;
abstract class Person1  
{      
	Person1(String fname,String lname)
	{
		System.out.println(fname);
		System.out.println(lname);
	}
	Person1(String fname,String lname, String job,int phoneno)
	{   
		System.out.println(job);
		System.out.println(phoneno);
	}
	Person1(String fname,String lname,String job,int phoneno,int id,int sal)
	{    
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(id);
		System.out.println(sal);
		System.out.println(job);
		System.out.println(phoneno);
	}	
}
class sample extends Person1
{

	sample(String fname, String lname, String job, int phoneno, int id, int sal) 
	{
		super(fname, lname, job, phoneno, id, sal);
	
	}	
	 
}	 	
public class AbstractClassStaticBlockAlone {
	public static void main(String[] args) {
		sample o=new sample("Raj","Kumar","Developer",997878788,900,9000);
		
	}
}
