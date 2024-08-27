package com.gentech.stringassignment;

public class TwoAwUsingReverseMethodReverseString2a {
	public static void main(String[] args) {
		reversString();

	}
	static void reversString() 
	{
		String s="Java Full Stack";
		 String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
		    s1+=s.charAt(i);
			
		}System.out.println(s1);
	}

} 
