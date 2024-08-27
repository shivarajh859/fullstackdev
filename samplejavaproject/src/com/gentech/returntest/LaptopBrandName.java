package com.gentech.returntest;
class BrandName
{
	static String laptop()
	{
		String st="Dell";
		return st;
	}
}
public class LaptopBrandName {

	public static void main(String[] args) {
		BrandName o=new BrandName();
		String s=o.laptop();
		System.out.println(s);
		 

	}

}
