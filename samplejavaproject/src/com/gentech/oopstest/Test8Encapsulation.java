package com.gentech.oopstest;
class BankAccount
{
	private int accountNumber;
	private double balance;

	public int setAccountNumber(int accountNumber)
	{
		  return this.accountNumber=accountNumber;
	}

	public int getAccountNumber()
	{
		return accountNumber;
	}
	public double setBalance(double balance)
	{
		return this.balance=balance;
	}


	public double getBalance() 
	{
		return balance;
	}
}

public class Test8Encapsulation {

	public static void main(String[] args) {
		BankAccount  o= new BankAccount();
		o.setAccountNumber(98934895);
		o.getAccountNumber();
		o.setBalance(50000.0);
		o.getBalance();
		System.out.println("Account Number: " + o.getAccountNumber());
		System.out.println("Account Balance: " + o.getBalance());





	}

}
