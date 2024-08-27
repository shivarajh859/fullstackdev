package com.assignment.methods;
class primeNo
{
	void primenumber( )
	{    
		 int count=0;
		for(int i=1;i<=50;i++) 
		{    int flage=0;
			for (int j = 2; j*j <= i; j++)
			{
				 if(i%j==0) 
				 {  
					 flage+=1;
					 break;					 
				 } 
				  
			}
			if(flage==0)
			{
				count++;
				
			}		
		}System.out.print(" "+count);
		  			
	}
}

public class PrimeNumber {
	public static void main(String args[]) {
		primeNo o=new primeNo();		 
		o.primenumber();
		
	}

}
