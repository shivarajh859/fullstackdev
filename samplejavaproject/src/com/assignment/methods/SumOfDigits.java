package com.assignment.methods;
class DigitsSum
{
	void digitssum(int n)
	{
		int sum = 0;
        while (n != 0) 
        {
            sum =sum+n % 10; // Add the last digit to sum
            n = n/10;       // Remove the last digit
        }
        System.out.println("Sum of digits: " + sum);
    }
}

public class SumOfDigits {
	

	public static void main(String[] args) {
		DigitsSum o=new DigitsSum();
		int num=1234;
		o.digitssum(num);
		 

	}

}
