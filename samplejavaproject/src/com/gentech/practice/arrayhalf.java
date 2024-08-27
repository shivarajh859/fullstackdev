package com.gentech.practice;
class ArrayHalf1
{   
	String array(String a[][])
	{     
		String str="";
	    for(int i=0;i<a.length;i++) 
	    {   
	    	for(int j=0;j<a[i].length;j++)
	    	{
	    		 str+=a[i][j]; 
	    	}
	    }
		return str;
		 
	    	  
	    }
		 
}
public class arrayhalf {
	public static void main(String args[]) {
		ArrayHalf1 o=new ArrayHalf1();
		String[][] a= {{"Hello","World","Hello"},{"World","Hello","World"}};
		 String res=o.array(a);
		System.out.println(res);
	}

}
