package com.gentech.methods;
class count
{
	void count1()
	{  int c=0;
		for(int i=50;i<=150;i++)
		{
			if(i%6==0)
			{
				c+=1;
			}
		}System.out.println("Count No Which is div by 6 in b/w 50-150 :"+c);
	}
}

public class CountofNum {

	public static void main(String[] args) {
		count o=new count();
		o.count1();
		 

	}

}
