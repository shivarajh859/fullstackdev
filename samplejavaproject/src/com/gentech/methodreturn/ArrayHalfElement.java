package com.gentech.methodreturn;
class arrayele
{   
	int[] array(int a[]) 
	{
	int res[]=new int [a.length]; 
	for(int i=0;i<a.length;i++)
	{
		res[i]=a[i];
		 				 
	}return res;

    }
}

public class ArrayHalfElement {

	public static void main(String[] args) {
		arrayele o=new arrayele();
		int a[]= {20,30,40,50,60,70,80};		 
		    int res[]=o.array(a);
		    for(int i=0;i<a.length/2;i++)
			System.out.println (res[i]);		
	}
	
}

