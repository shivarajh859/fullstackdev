package com.gentech.practice;
class ArrayOperations
{  
	String[] table(int j) 
	
	{ 
		String res[] =new String[10];
		for(int i=0;i<10;i++) 
			  
		  res[i]=j+"*"+(i+1)+"="+(j*(i+1));
		return res;
		 
	}
	 	
}
public class classdemo2 {
	public static void main(String[] args) {

		ArrayOperations o = new ArrayOperations();
		String str[]=o.table(9);
		for(String KK:str) 
		{ 
			System.out.println(KK);

		}
	}
}

