package com.gentech.stringparctice;

public class FindLengthWithoutMathaod {

	public static void main(String[] args) 
	{ 
		int c=0;
       String s="welcome";
       char len[]= s.toCharArray();
       for(char kk:len) 
       {
    	   c+=1;
       }
       System.out.println(c);

	}

}
