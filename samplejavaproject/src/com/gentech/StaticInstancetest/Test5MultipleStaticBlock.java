package com.gentech.StaticInstancetest;
class MultipleStaticBlock
{
	static 
	{
		System.out.println("Block 1");
	}
	static 
	{
		System.out.println("Block 2");
	}
	static 
	{
		System.out.println("Block 3");
	}
	static 
	{
		System.out.println("Block 4");
	}
	static 
	{
		System.out.println("Block 5");
	}
}
public class Test5MultipleStaticBlock {

	public static void main(String[] args) {
		MultipleStaticBlock o=new MultipleStaticBlock();

	}

}
