package com.assignment.methods;
class countprime
{
	void countprime()
	{
		int count = 0;
		int flage=0;
		for (int i = 50; i <= 150; i++) 
		{

			for (int j = 2; j * j <= i; j++) 
			{
				if (i % j == 0) 
				{
					flage+=1;
					break;
				}
			}
			if (flage==0) 
			{
				count++;
			}
		}
		System.out.println("Number of prime numbers between 50 and 150: " + count);
	}
}



public class PrimeNoCount {

	public static void main(String[] args) {
		countprime o=new countprime();
		o.countprime();


	}

}


