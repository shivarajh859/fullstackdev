package com.gentech.returntest;
class ArrayCount50to60
{  int  count=0;
	int countarr() 
	{    
		 for(int i=50;i>=30;i--) 
		 {  
			 if(i%4==0)
			 {
			     count+=1;
			 }
		 }
		return  count;
	}
}
public class CountNumbe50to30 {

	public static void main(String[] args) {
		ArrayCount50to60 o=new ArrayCount50to60();
		int c=o.countarr();
		System.out.println(c);
		 

	}

}
 
