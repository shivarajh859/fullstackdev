package com.assignment.methods;

class sumofele
{
	void arrysum(int arr[])
	{   int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}System.out.println("Sum of Array Elements:"+sum);
	}
}
public class Arraysumof {

	public static void main(String[] args) {
		
		sumofele o=new sumofele();
		int arr[]= {10,20,30,40,50,60};
		o.arrysum(arr);

	}

}
