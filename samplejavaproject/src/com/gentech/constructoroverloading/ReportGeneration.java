package com.gentech.constructoroverloading;
class Report
{ 
	Report(String name,String author,String repname)
	{

		System.out.println("Report Title:"+name);
		System.out.println("Author Name:"+author);
		System.out.println("Reporter Name:"+repname);

	}
	Report(String formate,int pages,String date)
	{	 
		System.out.println("Formate:"+formate);
		System.out.println("No of Pages:"+pages);
		System.out.println("Date:"+date);
	}
	Report(String content, boolean isConfidential,int phone)
	{	 
		System.out.println("Content:"+content);
		System.out.println("Usre Id:"+isConfidential);
		System.out.println("Phone NO:"+phone);

	} 
	Report(int pincode,String address,String state)
	{	 
		System.out.println("Address:"+address);
		System.out.println("Pincode:"+pincode);
		System.out.println("State:"+state);
	}
}

public class ReportGeneration {
	public static void main(String args[]) {
		Report o1=new Report("Annual Report","shivaraj","Ramakrishna Rao");
		Report o2=new Report("PDF",10,"27-06-2024");
		Report o3=new Report("This is the content of the monthly report",true,976773670);
		Report o4=new Report(560093,"Vijaynagar","Karnataka");
	}

}
