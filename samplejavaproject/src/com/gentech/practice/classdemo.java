package com.gentech.practice;
 class array
 {
	 int prime(int n)
	 {  if(n<=0) {
		 return 0;
		 
	 }
		 int flage=0;
		 for(int i=2;i<=n;i++)
		 if(n%i==0) {
			 flage+=1;
			 return 0;
			 
		 }
		 else if(flage==0)
		 {
			 return 1;
		 }
		return flage;
		
	 }
 }
public class classdemo {
	public static void main(String args[]) {
		array o=new array();
		 int n=o.prime(7);
		 if(n==1) {
			 System.out.println("prime:"+n);}
		 else
			 System.out.println("not prime:"+n);
		 
	}

}
