package com.gentech.inheritance;
class Student
{
	void studentdetails(String name,int rollno)
	{
		System.out.println("Student Name:"+name);
		System.out.println("Roll Number:"+rollno);
	}
}
class StudentAddress extends Student
{   
	void address(String city,String state,String country,int pincode)
	{
		System.out.println("City:"+city);
		System.out.println("State:"+state);
		System.out.println("Country:"+country);
		System.out.println("Pincode:"+pincode);
	}	
	
}
class StudentContact extends StudentAddress
{   
	void contact(String email,int phoneno)
	{
		System.out.println("Email:"+email);
		System.out.println("phone Number:"+phoneno);
		 		
	}
	
}
public class HeiraricalInheritance {

	public static void main(String[] args) {
		
		StudentAddress o=new StudentAddress();		
        o.studentdetails("Shivakumar",1089);
        o.address("Shahapur", "Karnataka", "India", 582332);
        System.out.println("---------------------");
		StudentContact o1=new StudentContact();
		o1.studentdetails("Raju", 10012);
		o1.address("Bangalore", "Karnataka", "India", 582002);
		o1.contact("raju@ss.com", 807987666);

	}

}
