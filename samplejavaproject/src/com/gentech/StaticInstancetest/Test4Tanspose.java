package com.gentech.StaticInstancetest;
class Tanspose
{
	static  
	{   
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) 
		{    
			for(int j=0;j<a[i].length;j++)  
			{
				  
			    b[j][i]=a[i][j]; 
				
			} 
		}
		for(int i=0;i<a.length;i++) 
		{    
			for(int j=0;j<a[i].length;j++)  
			{
				 
			    System.out.print(b[i][j]+" ");  
				
			} System.out.println();
		}
		
	}
}
public class Test4Tanspose {
	public static void main(String[] args) {
		Tanspose o=new Tanspose();

	}

}
