package com.gentech.stringparctice;

public class Palindrome {

	public static void main(String[] args) {
		String str="gadag";
		StringBuffer o=new StringBuffer( str);
		StringBuffer res=o.reverse();
		if(str.equals(o.toString()))
		{
			System.out.println("palindrome:"+res);
		}
		else
		{
			System.out.println("not a palindrome:"+res);
		}
		 
		 
	}

}
//package com.gentech.stringparctice;

//public class Palindrome {

//  public static void main(String[] args) {
//    String s = "gadag";
//StringBuffer sb = new StringBuffer(s);
// StringBuffer rev = sb.reverse();
        
// if (s.equals(sb.toString())) {
//  System.out.println("Palindrome: " + s);
//} else {
//  System.out.println("Not a palindrome: " + s);
// }
//}
//}
