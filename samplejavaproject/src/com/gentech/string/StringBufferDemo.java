package com.gentech.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		apppendString();
		insertdString();
		deleteString();
		reverseString();

	}
	static void apppendString()
	{
		StringBuffer s=new StringBuffer("Java");
		s.append(" Programming");
		System.out.println(s);
		
	}
	static void insertdString()
	{
		StringBuffer s=new StringBuffer("Java");
		s.insert(4, " Programming");
		System.out.println(s);
		
	}
	static void deleteString()
	{
		StringBuffer s=new StringBuffer("Java hfdgg Program");
		s.delete(4, 10);
		System.out.println(s);
		
	}
	static void reverseString()
	{
		StringBuffer s=new StringBuffer("Java  Program");
		s.reverse();
		System.out.println(s);
		
	}
	

}
