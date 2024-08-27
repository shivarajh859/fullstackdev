package com.assignment.methods;
class DoubleArray
{
	void doublearray(double a[][])
	{   double sum=0;
		for(int i=0;i<=a.length;i++)
		{ 
			
			    sum+=a[1][i];	
			
		}System.out.print(sum+" ");
	}
}

public class ArrayDouble {

	public static void main(String[] args) {
		DoubleArray o=new DoubleArray();
		double a[][]= {{20.5,30.5,10.5,},{25.5,15.5,35.5}};
		o.doublearray(a);
	 

	}

}
