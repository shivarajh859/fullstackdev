package com.gentech.methodreturn;
class Squar {

	int squar(int sqr) 
	{
		return sqr * sqr;
	}
}
public class SquareNum {

	public static void main(String[] args) {
		Squar o = new Squar();  		  
		int i=8;
		int res = o.squar(i); 
		System.out.println("Square of " + i + " is: " + res); 

	}

}


