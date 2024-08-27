package com.assignment.methods;

class onedimne
{
	void array(String a[])
	{   System.out.println("2nd Half Elements:");
		for(int i=a.length/2;i<a.length;i++)
		{
			
			System.out.print(" "+a[i]);
		} 
	}
}

public class OneDimenArray2ndhalf {

	public static void main(String[] args) {
		
		onedimne o=new onedimne();
		String a[]= {"a","b","c","d","e","f"};
		o.array(a);

	}

}
