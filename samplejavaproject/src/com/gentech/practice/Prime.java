package com.gentech.practice;

class PrimeNum {
    boolean isPrime(int n) 
    {
        if (n <= 1) 
        {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) 
        { // Check divisors up to the square root of n
            if (n % i == 0) 
            {
                return false; // Not a prime number
            }
        }
        return true; // Prime number
    }
}
 
public class Prime {
    public static void main(String[] args) {
        PrimeNum o = new PrimeNum();
        
        int number = 8; // Change this to test other numbers
        boolean result = o.isPrime(number);
        
        if (result) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
