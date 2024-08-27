package com.gentech.practice;
class nuprime
{
	boolean isprime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i*i <= n; i++) { // Check divisors up to the square root of n
            if (n % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // Prime number
    }
}
public class Numprime {

	public static void main(String[] args) {
		nuprime o=new nuprime();
		int num=9;
		boolean res=o.isprime(num);
		if(res ) {
			System.out.println(num+":prime");
		}
		else
		{
			System.out.println(num+" :not a prime");
		}

	}

}
 
