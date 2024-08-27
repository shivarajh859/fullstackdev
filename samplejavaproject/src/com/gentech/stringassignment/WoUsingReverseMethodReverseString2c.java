package com.gentech.stringassignment;

public class WoUsingReverseMethodReverseString2c {

	public static void main(String[] args) {
		reversString();

	}
	static void reversString() 
	{
		String s="Java Full Stack";
		String s1="";
		for(int i=s.length();i>0;i--)
		{
			s1+=s.substring(i-1,i);	
			
		}System.out.println(s1);
	}

} 
       