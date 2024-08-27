package com.assignment.methods;

class arryboolean
{
	void boolean1(boolean arr[])
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println("Boolean value:"+arr[i]);
		}
	}
}
public class Boolean {

	public static void main(String[] args) {
		arryboolean o=new arryboolean();
		boolean arr[]= {true,true,true,false};
		o.boolean1(arr);

	}

}
