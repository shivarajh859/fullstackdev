package com.gentech.methodreturn;
class seventhtable
{
	String[] seventtable( int num)
	{
		String[] res = new String[10];
        for(int i=1;i<=10;i++){
            res[i-1]= "7 * "+i+" = "+(7*i);
        }
        return res;
	}
}
public class SeventhTableReverse {

	public static void main(String[] args) {
		
		seventhtable o=new seventhtable();
		String res[] = o.seventtable(7);
		for(int i=9;i>=0;i--)
		{
			System.out.println(res[i]);
		}

	}

}
