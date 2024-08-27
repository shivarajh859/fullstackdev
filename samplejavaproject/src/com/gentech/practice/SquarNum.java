package com.gentech.practice;
class SqrNumber
{
	int number (int n)
	{   
		int sum=0;
		{
			sum=n*n;
		}return sum;
	}
}
public class SquarNum {
	public static void main(String args[]) {
		SqrNumber o=new SqrNumber();
		for(int i=1;i<=10;i++) {
			int sum=o.number(i);
			System.out.println(sum);
		}
			
	}

}
