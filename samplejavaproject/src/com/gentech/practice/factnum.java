package com.gentech.practice;
class fnum
{    
	int fnum(int n) 
	{
		if(n==0) 
		{
			return 1;
		}
		else 
		{
			return n*fnum(n-1);
	     }
     }	
}
public class factnum {

	public static void main(String[] args) {
		
		fnum o=new fnum();
		int n=o.fnum(1);
		 
		System.out.println(n);

	}

}
