package com.gentech.string;

public class StringOperation {

	public static void main(String[] args) {
		//getCharCount();
		//validateString();
		//getCharBasedonPosition();
		upperCaseStr();
		lowerCaseStr();
		replaceStr();
		comparestring();
		comparestring1();
		existanceOfString();
		//extractString();
		convertToCharArray();
		splitstring();
		convertToString();
		convertToByteArray();

	}
	static void getCharCount()
	{
		 String s="welcome";
	     int count=s.length();
	     System.out.println(" # of chars:"+count);
	     System.out.println(s);
	     System.out.println("------------------");
	}
    static void validateString()
    {
    	String s=new String();
    	boolean v=s.isEmpty();
    	System.out.println(v);
    	
    }
    static void getCharBasedonPosition()
    {
    	String s=new String("Welcome");
    	char ch=s.charAt(5);
    	System.out.println(ch);
    	
    }
    static void upperCaseStr()
    {
    	String s=new String("Welcome");
    	String ch=s.toUpperCase();
    	System.out.println(ch);
    	
    }
    static void lowerCaseStr()
    {
    	String s=new String("Welcome");
    	String ch=s.toLowerCase();
    	System.out.println(ch);	
    }
    static void replaceStr()
    {
    	String s=new String("Welcome to BNG");
    	String ch=s.replace("BNG","Bangalore");
    	System.out.println(ch);		
    }
    static void comparestring()
    {
    	
    	String s="WELCOME";
    	String s1="WELCOME";
    	String s2=new String("WELCOME");
    	String s3=new String("WELCOME");
    	boolean v=s1.equals(s2);
    	System.out.println(v);
    	boolean v1=s1.equalsIgnoreCase(s2);
    	System.out.println(v1);
    }
    static void comparestring1()
    {   	
    	String s="Welcome"; 
    	String s1=new String("WELCOME");
    	int v=s.compareTo(s1);
    	System.out.println(v);
    	int v1=s.compareToIgnoreCase(s1);
    	System.out.println(v1);
    }
    static void existanceOfString()
    {   	
    	 
    	String s1=new String("Welcome to Banaglore");
    	boolean v=s1.startsWith("W");
    	System.out.println(v);
    	boolean v1=s1.endsWith("e");
    	System.out.println(v1);
    	boolean v2=s1.contains("gl");
    	System.out.println(v2);
    	System.out.println("-----------");
    }
    static void extractString()
    {   	
    	 
    	String s1=new String("Welcome to Banaglore");
    	String s=s1.substring(9);
    	System.out.println(s);
    	String s2=s1.substring(2,4);
    	System.out.println(s2);
    	System.out.println("----------------------");
    }
    static void convertToCharArray()
    {   	
    	 
    	String s=new String("Welcome to Banaglore");
    	char ch[]=s.toCharArray();
    	for(char kk:ch)
    	System.out.print(kk);
    	System.out.println("--------------------");   
    }
    static void splitstring()
    {   	
    	 
    	String s=new String("Apple,Mango,Orange,Bannana");
    	String str[]=s.split(",");
    	for(String kk:str)
    	System.out.println(kk);
    	System.out.println("--------------------");   
    }
    static void convertToString()
    {   	
    	 
    	 double d=10.56;
    	String str=String.valueOf(d);
    	System.out.println(str);
    	System.out.println("--------------------");   
    }
    static void convertToByteArray()
    {   	
    	 
    	String s=new String("Apple,Mango,Orange,Bannana");
    	byte a[]=s.getBytes();
    	for(int kk:a)
    	System.out.print(kk+" ");
    	System.out.println("--------------------");   
    }
    
    
}
