package com.assignment.methods;
class table
{
	void table1( )
	{    
		for(int i=1;i<=20;i++)
		{   					
		    for(int j=1;j<=10;j++)
		    {
			    System.out.println(i+" *"+j+"="+(j*i));
		    }System.out.println("---------------------");
		} 
		
	   
	}
}
public class Table1to20 {

	public static void main(String[] args) {
		
		table o=new table();
		    o.table1( );
		 
		

	}

}
