package com.gentech.methodreturn;
class Arraychar
{
	char[][] array(char a[][])
	{   
		char res[][]=new char[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				res[i][j]=a[i][j];
			}
		}return res;
	}
}
public class CharArray {
	public static void main(String[] args) {		
		Arraychar o=new Arraychar();
		char a[][]= {{'a','b','c'},{'d','e','f'}};

		for(int i=0;i<=a.length;i++)
		{
			System.out.print(a[0][i]+" ");
		}

	}

}
