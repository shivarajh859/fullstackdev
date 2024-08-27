package com.assignment.methods;
class ArrayTanspose
{
	void ArrayTanspose1(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[j][i]+" ");
			}System.out.println();
		}
	}
}

public class TansposeArray {

	public static void main(String[] args) {
		ArrayTanspose o=new ArrayTanspose();
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		o.ArrayTanspose1(a) ;
		 

	}

}
