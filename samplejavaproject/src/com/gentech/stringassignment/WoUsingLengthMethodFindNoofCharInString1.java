package com.gentech.stringassignment;

public class WoUsingLengthMethodFindNoofCharInString1 {

	public static void main(String[] args) {
		Stringlength();
	}
	static void Stringlength()
	{   
		int c=0;
		String s= "It is a Wonderfull Place";
		 for(char c1:s.toCharArray())
		 {
			 c++;
		 }System.out.println(c);
		 
	}


}
