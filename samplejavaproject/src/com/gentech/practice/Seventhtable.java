package com.gentech.practice;
class Table
{  
	String[] seventhtable(int n)
	{    String[] a=new String[11];
		 for(int i=1;i<=10;i++)
		 {  
			    a[i]=n+"*"+i+"="+(n*i);
		 }
	
		return a ;
	}
}
public class Seventhtable {

	public static void main(String[] args) {
		Table o=new Table();
		 String[] s=o.seventhtable(7);
		 for(int i=1;i<=10;i++)
         System.out.println(s[i]);
	}

}
