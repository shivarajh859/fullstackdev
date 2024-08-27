package com.gentech.returntest;
class largest3num
{
	int lagrest3(int a,int b,int c)
	{  
		if((a>b)&&(b>c))
			{
			    return a;
			}
		if ((b>a)&&(b>c)) 
		{
			return b;
		}
		else
		{
			return c;
		}	 
	}
}
public class Largest3Number {

	public static void main(String[] args) {
		largest3num o=new largest3num();
		int res=o.lagrest3(10, 50, 30);
		System.out.println(res);
		 

	}

}
