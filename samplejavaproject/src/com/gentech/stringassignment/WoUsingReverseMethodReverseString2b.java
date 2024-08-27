package com.gentech.stringassignment;

public class WoUsingReverseMethodReverseString2b {

	public static void main(String[] args)
	{
		stringrevers();

	} 
	static void stringrevers()
	{
		String s="Welcome to Java Programming";
		String rev="";
		char s1[]=s.toCharArray();
		 for (int i=s1.length-1;i>=0;i--) 
		{ 
			 rev+=s1[i];
		}System.out.println(rev);
		
	}

}
