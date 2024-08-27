package com.gentech.StaticInstancetest;
class Instance
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
class StaticBlock 
{
	String name;
	StaticBlock(String name1)
	{
		name=name1;
		System.out.println("Name:"+name);
		Instance o=new Instance();
	}
}
public class Test7 {
	public static void main(String[] args) {
		StaticBlock o=new StaticBlock("Ramesh");


	}

}
