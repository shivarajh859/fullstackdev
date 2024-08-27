package com.gentech.returntest;
class ArrayCount
{  int  count=0;
	short countarray (int a[][]) 
	{    
		 for(int i=0;i<a.length;i++) 
		 {   
			 for(int j=0;j<a[i].length;j++)
			 count+=1;
		 }
		return (short) count;
	}
}
public class ShortArrayCount {

	public static void main(String[] args) {
		ArrayCount o=new ArrayCount();
		 int[][] a= {{1,2,3},{4,5,6}};
		 int s=o.countarray(a);
		 System.out.println(s);
		

	}

}
