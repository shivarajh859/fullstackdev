package com.assignment.methods;
class noofdigits
{   
	void noofdigits(int n   )
	{    
		int count=0;
		if (n < 0) 
		{
			n = -n;
		}
		if (n==0)
		{
			count=1;
		}
		while(n!=0)
		{
			n = n / 10;
			count++;
		}

		System.out.println("The number of digits  is: " + count);
	}	 

} 

public class FindNoOfDigits {

	public static void main(String[] args) {
		noofdigits o=new noofdigits(); 
		int n =98988;
		o.noofdigits( n );

	}

}
