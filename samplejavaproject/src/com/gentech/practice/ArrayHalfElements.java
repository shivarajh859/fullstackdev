package com.gentech.practice;

import java.util.Arrays;

class arrayhalfele
{
	int[][] arrayhalf(int a[][])
	{   int res[][]=new int[a.length][a[0].length];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		res[i][j]=a[i][j];	 
	}return res;
	}
}
public class ArrayHalfElements {
	public static void main(String[] args) {
		arrayhalfele o=new arrayhalfele();
		int a[][]= {{10,20,30},{40,50,60}};
		int res[][]=o.arrayhalf(a);		
		System.out.println(Arrays.toString(res));
	}

}
