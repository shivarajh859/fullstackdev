package com.gentech.stringparctice;

public class WithoutReveserMethod {

	public static void main(String[] args) {
		reverseString();
 

	}
	static void reverseString()
	{
		String s="Welcome";
		String res="";
		char[] s1= s.toCharArray();
	    for(int i=s1.length-1;i>=0;i--)
	    {
	    	res+=s1[i];
	    	
	    }System.out.println(res);
	    
		
		
	}

}
