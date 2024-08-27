package com.gentech.methodreturn;
class FactNum
{   
	double factNum(int n)
	{    
		if(n==1)
		{
			return 1;
		}
		else
		{
			return (n*factNum(n-1));
		}
	} 

}
public class FactorialNum {

	public static void main(String[] args) {		
		FactNum o=new FactNum();
		int num=-8;	  
		double res=o.factNum(num);
		System.out.println(res); 


	}
}


