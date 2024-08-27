package com.gentech.oopstest;
abstract class Account
{
	abstract void display();
}
class SavingsAccount extends Account
{	 
	void display() 
	{
		int accountNumber=989984;
		String accountHolderName="Ramesh";
		System.out.println("SavingsAccount Holder Name:"+accountHolderName);
		System.out.println(" SavingsAccount Number:"+accountNumber);		
	}
	
}
class BusinessAccount extends Account
{
	void display()
	{
		int accountNumber=989984;
		String accountHolderName="Krishna"; 
		System.out.println("BusinessAccount Holder Name:"+accountHolderName);
		System.out.println(" BusinessAccount Number:"+accountNumber);
		 
	}	
}
class CheckingAccount extends Account
{
	void display()
	{
		int accountNumber=989984;
		String accountHolderName="Krishna"; 
		System.out.println("CheckingAccount Holder Name:"+accountHolderName);
		System.out.println(" CheckingAccount Number:"+accountNumber);
		 
	}
}
public class Test9Ploymorphism {

	public static void main(String[] args) {
		Account acc=null;
		SavingsAccount sv=new SavingsAccount();
		BusinessAccount ba=new BusinessAccount();
		CheckingAccount ch=new CheckingAccount();
		acc=sv;
		acc.display();
		
		acc=ba;
		acc.display();
		
		acc=ch;
		acc.display();

	}

}
