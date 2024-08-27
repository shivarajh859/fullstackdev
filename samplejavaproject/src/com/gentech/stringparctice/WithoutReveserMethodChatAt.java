package com.gentech.stringparctice;

public class WithoutReveserMethodChatAt {
	public static void main(String[] args) {
		reverese();
		

	}
	
	static void reverese()
	{
		String s="welcome";
		char rev=0;
		for(int i=s.length();i>0;i--)
		{
			rev=s.charAt(i-1);
			System.out.print(rev);
		}
	}
	

}
