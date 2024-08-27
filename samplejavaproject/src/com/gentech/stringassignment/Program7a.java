package com.gentech.stringassignment;
public class Program7a {

	public static void main(String[] args) {
		 StringTriangle();

	}
	static void  StringTriangle() 
	{
		String s="PROGRAM";
		String s1=" ";
		for(int i=0;i<s.length();i++)
		{
			s1+=s.charAt(i);
			System.out.println(s1);
		} 

	}

} 


