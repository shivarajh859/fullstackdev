package com.assignment.methods;
class maths
{
	void table(int num)
	{   
		for(int i=1;i<=10;i++)
		{   					
		     
			    System.out.println(num+" *"+i+"="+(num*i));
		    
		}  
	}
	
}

public class MathsTable {

	public static void main(String[] args) {
		maths o=new maths();
		int num=2;
		o.table(num);
		
		 

	}

}
