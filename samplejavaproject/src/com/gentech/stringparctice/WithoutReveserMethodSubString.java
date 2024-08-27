package com.gentech.stringparctice;

public class WithoutReveserMethodSubString {
	public static void main(String[] args) {
		reverse();
	}
	static void reverse()
	{
		String s="Welcome";
		String rev="";
		 for(int i=s.length();i>0;i--)
		 {
			  rev+=s.substring(i-1,i);
		 }
		  System.out.println(rev);
		
	}

}
