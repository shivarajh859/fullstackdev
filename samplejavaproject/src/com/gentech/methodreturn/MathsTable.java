package com.gentech.methodreturn;
class table
{    
	String[] table(int num)
	{
		String arr[]=new String[10];
		int k=0;
		for(int i=1;i<=10;i++)
		{
			String str=num+"*"+i+"="+(num*i);
			arr[k]=str;
			k++;
		}return arr;
	}
}
public class MathsTable {

	public static void main(String[] args) {
		table o=new table();
		String arr[]=o.table(7);
		 for( String oo:arr)
		 {   			 
        	 System.out.println(oo); 
		 }
	}

}
