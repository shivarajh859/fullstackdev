package com.gentech.methods;
class sum
{
	void sum1()
	{   int num=0;
		for(int i=1;i<=50;i++)
		{
			num=num+i;
			
		}System.out.println("Sum of Number b/w 1-50 :"+num);
	}
}

public class SumofNumber {
public static void main(String args[]) {
	sum o1=new sum();
	o1.sum1();
	 
	
}
}
