package com.gentech.constructoroverloading;
class Contract1
{ 
	Contract1(String name,String pro,int id)
	{

		System.out.println("Client Name:"+name);
		System.out.println("Project Name:"+pro);
		System.out.println("Client Id:"+id);

	}
	Contract1(String isSigned,int phone)
	{	 
		System.out.println("Project is Signed:"+isSigned);
		System.out.println("Phone No:"+phone);

	}
	Contract1(String releaseDate,int budget,String endDate)
	{	 
		System.out.println("Start Date:"+releaseDate);
		System.out.println("Budget:"+budget);
		System.out.println("End Date:"+endDate);

	} 
	Contract1(int pincode,String address,String state)
	{	 
		System.out.println("Address:"+address);
		System.out.println("Pincode:"+pincode);
		System.out.println("State:"+state);
	}
}

public class Contract {
	public static void main(String args[]) {
		Contract1 o1=new Contract1("Amir Khan","FaceBook",10);
		Contract1 o2=new Contract1("yes",999284982);
		Contract1 o3=new Contract1("25-07-2024",1000000,"25-07-2029");
		Contract1 o4=new Contract1(560093,"Vijaynagar","karnataka");

	}

}
