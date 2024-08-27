package com.gentech.methods;
class concat
{   String str="";
	void charconcat(char a[][])
	{
		 for(int i=0;i<=a.length;i++) 
		 {
			 System.out.print(a[0][i]);
		 }
	} 
	
}
public class TwoDimencharconct {

	public static void main(String[] args) {
		 
		concat o=new concat();
		char a[][]= {{'a','b','c'},{'d','e','f'}};
		o.charconcat(a);	
	}

}
