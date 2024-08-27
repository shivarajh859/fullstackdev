package com.gentech.returntest;
class booleanarray
{
	static  boolean[] booleanelements()
	{
	   boolean a[]= {true,false,true,false};
	   return a;    	  	 
	}  
}
public class OneDimensionalBooean {
	public static void main(String[] args) {
		booleanarray o=new booleanarray();
		 boolean a[]=o.booleanelements();
		 for( boolean res:a)
		 System.out.println(res);

	}

}
