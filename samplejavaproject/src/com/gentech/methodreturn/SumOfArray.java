package com.gentech.methodreturn;
class arrayofsum
{
	int  arrayofsum(int a[])
	{
		int res=0;
		for(int i=0;i<a.length;i++)
		{
			res+=a[i];
		}return(res);
	}
}
public class SumOfArray {

	public static void main(String[] args) {
		arrayofsum o=new  arrayofsum();				  
		int a[]= {10,20,30,40,50,60};	
		int sum=0;
		int res=o.arrayofsum(a);	 
		System.out.println("Sum of Array Elements: "+res);
	}

}
