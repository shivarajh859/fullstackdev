package com.gentech.polymorphism;
abstract class payment1
{
	abstract void display(); 
}
class OnlinePayment extends  payment1
{
	void display()
	{
		int amount=10000;
		String tansNo="j9849u2ri00";
		System.out.println("Online Paid Amount:"+amount);
		System.out.println("  Tansaction Number:"+tansNo);
	}
}
class OfflinePayment extends OnlinePayment
{
	void display()
	{
		int amount=39000;
		String tansNo="j9849u2ri00";
		System.out.println("OfflinePayment Paid Amount:"+amount);
		System.out.println("  Tansaction Number:"+tansNo);
	}
}
class CreditCardPayment extends OnlinePayment
{
	void display()
	{
		int amount=20000;
		String tansNo="j9849u2ri00";
		System.out.println("CreditCardPayment Paid Amount:"+amount);
		System.out.println("  Tansaction Number:"+tansNo);
	}
}
class PhonePePayment extends OnlinePayment
{
	void display()
	{
		int amount=30000;
		String tansNo="j9849u2ri00";
		System.out.println("PhonePePayment Paid Amount:"+amount);
		System.out.println("  Tansaction Number:"+tansNo);
	}
}
public class Payment {
	public static void main(String[] args) {
		payment1 pay=null;
		OnlinePayment on=new OnlinePayment();
		OfflinePayment off=new OfflinePayment();
		CreditCardPayment cc=new CreditCardPayment();
		PhonePePayment pp=new PhonePePayment();
		pay=on;
		pay.display();
		
		pay=cc; 
		pay.display();
		
		pay=pp;
		pay.display();
		
		pay=off;
		pay.display();
		 

	}

}
