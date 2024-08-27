package com.gentech.string;

public class StringBuilderdDemo {

	public static void main(String[] args) {
		apppendString();
		insertdString();
		deleteString();
		reverseString();

	}
	static void apppendString()
	{
		StringBuilder s=new StringBuilder("Java");
		s.append(" Programming");
		System.out.println(s);
		
	}
	static void insertdString()
	{
		StringBuilder s=new StringBuilder("Java");
		s.insert(4, " Programming");
		System.out.println(s);
		
	}
	static void deleteString()
	{
		StringBuilder s=new StringBuilder("Java hfdgg Program");
		s.delete(4, 10);
		System.out.println(s);
		
	}
	static void reverseString()
	{
		StringBuilder s=new StringBuilder("Java  Program");
		s.reverse();
		System.out.println(s);
		
	}
	

}
