package com.gentech.practice;
 abstract class abstarct
{
	 
    static void display(String name)
	{    
		System.out.println("Name:"+name);
	}
	static void display1(String name)
	{    
		System.out.println("Name:"+name);
	}
	static void display2(String name)
	{   
		System.out.println("Name:"+name);
	}

}
public class AbstractMulStaticMethod {

	public static void main(String[] args) {
		  abstarct.display("Raju");
		  abstarct.display1("Ramesh");
		  abstarct.display2("Rakesh");

	}

}
