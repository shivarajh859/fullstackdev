package com.gentech.polymorphism;
abstract class Account1
{
	abstract void display(); 
}
class SavingsAccount extends  Account1
{
	void display()
	{
		int accountNumber=989984;
		String accountHolderName="Krishna";
		double balance=834785;
		System.out.println("SavingsAccount Holder Name:"+accountHolderName);
		System.out.println(" SavingsAccount Number:"+accountNumber);
		System.out.println("SavingsAccount Balance:"+balance);
	}
}
class BusinessAccount extends Account1
{
	void display()
	{
		int accountNumber=989984;
		String accountHolderName="Krishna";
		double balance=834785;
		System.out.println("BusinessAccount Holder Name:"+accountHolderName);
		System.out.println(" BusinessAccount Number:"+accountNumber);
		System.out.println("BusinessAccount Balance:"+balance);
	}
}
class CheckingAccount extends Account1
{
	void display()
	{
		int accountNumber=989984;
		String accountHolderName="Krishna";
		double balance=834785;
		System.out.println("CheckingAccount Holder Name:"+accountHolderName);
		System.out.println(" CheckingAccount Number:"+accountNumber);
		System.out.println("CheckingAccount Balance:"+balance);
	}
}
class CreditCardAccount extends Account1
{
	void display()
	{
		int accountNumber=989984;
		String accountHolderName="Krishna";
		double balance=834785;
		System.out.println("CreditCardAccount Holder Name:"+accountHolderName);
		System.out.println(" CreditCardAccount Number:"+accountNumber);
		System.out.println("CreditCardAccount Balance:"+balance);
	}
}
public class Account {
	public static void main(String[] args) {
		Account1 ac=null;
		SavingsAccount sv=new SavingsAccount();
		BusinessAccount ba=new BusinessAccount();
		CreditCardAccount cc=new CreditCardAccount();
		CheckingAccount ch=new CheckingAccount();
		
		ac=sv;
		ac.display();

		ac=ba; 
		ac.display();
		 
		ac=cc;
		ac.display();

		ac=ch; 
		ac.display();


	}

}
