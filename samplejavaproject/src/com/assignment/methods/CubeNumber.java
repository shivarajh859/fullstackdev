package com.assignment.methods;
class cube
{
	int[] cubenumber(int a[])
	{  
		int num[]=new int[a.length]; 
		for(int i=0;i<a.length;i++)
		{    
			num[i]=a[i]*a[i]*a[i];
	     
		}
		return num;
   	 
	}
}

public class CubeNumber {

	public static void main(String[] args) {		
		cube o=new cube();
		int a[]= {2,4,5,6,7};
		int num[]=o.cubenumber(a);
		for(int i=0;i<a.length;i++)
		System.out.println(num[i]);
	}

}
