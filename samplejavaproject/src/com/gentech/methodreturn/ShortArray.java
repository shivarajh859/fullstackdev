package com.gentech.methodreturn;
class arrayshort
{
	short[] arrayshort(short a[])
	{   
		short res[]=new short[a.length];
		for( short i=0;i<a.length;i++)
		{
			res[i]=a[i];	
		}return res;
	}
}
public class ShortArray {

	public static void main(String[] args) {
		arrayshort o=new arrayshort();
		short a[]= {10,20,30,40,50,60,70,80,90};
		short res[]=o.arrayshort(a);
		for( int i=(a.length-1)/2;i>1;i++) 
		{
			System.out.println(res[i]);
		}

	}

}
