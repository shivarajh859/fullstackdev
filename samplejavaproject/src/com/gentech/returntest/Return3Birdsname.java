package com.gentech.returntest;
class Birdsname
{
	String[] birdsname() 
	{
 		String[] a= {"Crow","Egale","Parrot"};
		return a;
	}
}
public class Return3Birdsname {

	public static void main(String[] args) {
		Birdsname o=new Birdsname();
	     String[] a=o.birdsname();
	     for(int i=0;i<3;i++)
	     System.out.println(a[i]);

	}

}
