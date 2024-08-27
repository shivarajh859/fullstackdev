package com.gentech.methodreturn;
class concatenation
{   
	String concat(String str[])
	{    
		String s="";
		for(int i=0;i<str.length;i++)
		{  
			s+=str[i];
		}return s;
	}
}
public class Concat1DArray {
	public static void main(String args[]) {
		concatenation o=new concatenation();
		String str[]= {"A","B","C","D","E","F"};
		String s=o.concat(str);			 
		System.out.println(s);
	}

}
