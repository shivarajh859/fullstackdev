package com.gentech.stringassignment;
public class Program7b {

	public static void main(String[] args) {
		StringHalfDaimond();

	}
	static void  StringHalfDaimond() 
	{
		String s="PROGRAM";
		String s1=""; 
		for( int j=0;j<s.length();j++)
		{
			s1+=s.charAt(j);
			System.out.println(s1);

		}
		for (int j = s.length()-1; j>0; j--) 
		{
			String res=s.substring(0,j);
			System.out.println(res);
		}
	} 

}
