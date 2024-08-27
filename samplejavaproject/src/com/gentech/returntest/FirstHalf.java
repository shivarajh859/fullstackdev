package com.gentech.returntest;

class ArrayHalf1
{   
	String array(String a[])
	{     
		String str="";
		for(int i=0;i<a.length/2;i++) 
		{   

			str+=a[i] ; 

		}
		return str;	 
	}	 
}

public class FirstHalf {

	public static void main(String[] args) {
		ArrayHalf1 o=new ArrayHalf1();
		String[] a= {"Hello","World","A","B","C","D"};
		String res=o.array(a);
		System.out.println(res);


	}

}
