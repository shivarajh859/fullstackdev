package com.assignment.outerinner;
class Student
{ 
	int age;
	int phoneNo;
	void displayOutter() 
	{
		age=15;
		phoneNo=700098498;
		System.out.println("Age:"+age);
		System.out.println("phone Number:"+phoneNo);
	}
	static class StudentDetails
	{
		String  stdName;
		String  standerd;
		String gender;
          
	}
	void displaystatic()
	{
		String stdName = "Shivarj";
		String standerd="7th Std";
		String gender="Male";
		System.out.println("Student Name:"+stdName);
		System.out.println("Standerd:"+standerd);
		System.out.println("Gender :"+gender);
		
	}
	 
}
public class OutterInnerStatic {

	public static void main(String[] args) {
		Student o=new Student();
        o.displaystatic();
        o.displayOutter();

	}

}
