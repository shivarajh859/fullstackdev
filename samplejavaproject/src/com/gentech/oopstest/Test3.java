package com.gentech.oopstest;
abstract class Person
{   
	void display()
	{
		System.out.println("----Instance Block-------");
		String personName = "Rakesh";
        String job = "Data Analyst";
        int personId = 80889;
        System.out.println("Person Name: " + personName);
        System.out.println("Person Job: " + job);
        System.out.println("Person Id: " + personId);
        System.out.println("--------------");
	}
	static 
	{
		System.out.println("------Static Block---");
		String personName = "Rakesh";
        String job = "Data Analyst";
        int personId = 80889;
        System.out.println("Person Name: " + personName);
        System.out.println("Person Job: " + job);
        System.out.println("Person Id: " + personId); 
        System.out.println("--------------");
        
	}
}
class sample extends Person
{
	
}
public class Test3 {

	public static void main(String[] args) {
		 sample o=new sample();	 
		 o.display();

	}

}
