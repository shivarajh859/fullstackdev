package com.gentech.returntest;
class booleanarray1
{
	 static boolean[] booleanarray(boolean a[]) 
	{    boolean[] res=new boolean[a.length];
		 for(int i=0;i<a.length;i++)
		 {
			 res[i]=a[i];
		 }
		return res;		
	}
}
public class StaticMethod1DBooleanArray {

	public static void main(String[] args) {
		booleanarray1 o=new booleanarray1();
		boolean a[]= {true,false,true,false};
		boolean[] res=o.booleanarray(a);
		for(int i=0;i<a.length;i++)
		System.out.println(res[i]);

	}

}
