package com.gentech.stringparctice;

public class WithoutReplaceMethod {

	public static void main(String[] args) {
		replaceString();

	}
	static void replaceString()
	{
		
		String s="It is Buetifull place";
		String s1="was";
		StringBuffer o=new StringBuffer();
		//String res =s.replace("is", "was");
		o.append(s);
		o.append(s1.substring(s1.indexOf("was")));
		System.out.println(o);
	
		
	}

}
