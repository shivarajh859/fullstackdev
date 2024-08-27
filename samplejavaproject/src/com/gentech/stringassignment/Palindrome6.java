package com.gentech.stringassignment;

public class  Palindrome6 {

	public static void main(String[] args) {
		reversString();

	}
	static void reversString() 
	{
		String s="GADAG";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1+=s.charAt(i);

		}System.out.println(s1);
		if(s.equals(s1)) 
		{
			System.out.println("String is Palindrome :"+s);
		}
		else
		{
			System.out.println("String is not a Palindrome:"+s);
		}
	}


} 
