package com.gentech.methods;
class disparry
{
	void revsarry(String arr[])
	{    
		
		for(int i=arr.length-1;i>0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
public class Array {

	public static void main(String[] args) {
		disparry o=new disparry();
		String arr[]= {"a","b","c","d","e"};
		 o.revsarry(arr);
  
	}

}
