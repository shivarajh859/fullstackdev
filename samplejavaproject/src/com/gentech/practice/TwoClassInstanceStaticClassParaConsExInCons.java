package com.gentech.practice;
class Instances
{
	{	
		String cname = "Benz";
		int Cno=100;
		System.out.println("Car Name:"+cname);
		System.out.println("Car Number id:"+Cno);
	}
	static 
	{	
		String job = "Developer";
		int phone=999787342;
		System.out.println("JOb Name:"+job);
		System.out.println("Phone Number id:"+phone);
	}
}
class StaticBlocks   
{
	String name;
	StaticBlocks(String name1)
	{
		name=name1;
		System.out.println("Name:"+name);
	}
	Instances o=new Instances();
}
public class TwoClassInstanceStaticClassParaConsExInCons {

	public static void main(String[] args) {
		StaticBlocks o=new StaticBlocks("Ramesh");

	}

}
