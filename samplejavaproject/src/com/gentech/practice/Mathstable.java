package com.gentech.practice;
class Maths
{   
	String[] table(int num) 
	{   
		String[] arr=new String[11];
		for(int i=1;i<=10;i++)
		{     
			String str=num+"*"+i+"="+(num*i);
			arr[i]=str;
			
		} return arr;
	}
	
}
public class Mathstable {

	public static void main(String[] args) {
		
		Maths o=new Maths();
		String[] str=o.table(7);
		for(int i=1;i<=10;i++)
		System.out.println(str[i]);

	}

}
