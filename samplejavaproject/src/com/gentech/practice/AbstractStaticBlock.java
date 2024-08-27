package com.gentech.practice;
abstract class staticblock
{
	static 
	{   
		System.out.println("block 1");
	}
	static 
	{
		System.out.println("block 2");
	 
	}
	static
	{
		System.out.println("block 3");
	}
}
class staticblock1 extends staticblock{
	static {
		System.out.println("block 4");
	}	
}
public class AbstractStaticBlock {

	public static void main(String[] args) {
		 
		staticblock1 o=new staticblock1();
	}

}
