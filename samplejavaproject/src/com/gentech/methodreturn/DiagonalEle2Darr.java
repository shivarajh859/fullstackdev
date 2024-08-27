package com.gentech.methodreturn;
class diagonal
{
	short[][] diagonal(short a[][])
	{    
		short res[][]=new short [a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				res[i][j]=a[i][j];
			}
		}return res;
	}
}
public class DiagonalEle2Darr {

	public static void main(String[] args) {
		diagonal o=new diagonal();		
		short a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		short res[][]=o.diagonal(a);
		for(int i=0;i<a.length;i++)
		{  
			System.out.println(a[i][i]);
		}

	}

}
