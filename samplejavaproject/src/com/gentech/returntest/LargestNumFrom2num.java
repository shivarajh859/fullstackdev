package com.gentech.returntest;
class Num
{    
	int number(int a,int b)
	{		 
		 if(a>b)
		 {
			 return a;
		 }
		 else
		 {
			 return b;
		 }
	}
}
public class LargestNumFrom2num {

	public static void main(String[] args) {
		Num o=new Num();
		 int res=o.number(10, 12);
		 System.out.println(res);
		

	}

}
