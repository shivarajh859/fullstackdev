package com.gentech.methodreturn;
class arrayreverse
{
	double[] arrayreverse(double a[])
	{
		double res[]=new double[a.length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}return res;
	}
}
public class ReverseArray1Ddouble {

	public static void main(String[] args) {
		arrayreverse o=new arrayreverse();
		double a[]= {10,20,30,40,50,60};
		double res[]=o.arrayreverse(a);
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(res[i]);
		}

	}

}
