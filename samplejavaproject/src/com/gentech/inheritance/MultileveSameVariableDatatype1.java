package com.gentech.inheritance;

class Invoice10 {
	String name;
	String email;
	int id;

	Invoice10(String iname, String iemail, int iid) {
		name = iname;
		email = iemail;
		id = iid;  
	}

	void show1(String iname, String iemail, int iid) {
		System.out.println("Invoice1:");
		System.out.println("Customer Name: " + iname);
		System.out.println("Email: " + iemail);
		System.out.println("Customer Id: " + iid);
	}
}

class Invoice11 extends Invoice10 {
	String name;
	String email;
	int id;

	Invoice11(String iname, String iemail, int iid) {
		super(iname, iemail, iid);
		name = iname;
		email = iemail;
		id = iid;
	}

	void show2(String iname, String iemail, int iid) {
		System.out.println("Invoice2:");
		System.out.println("Customer Name: " + iname);
		System.out.println("Email: " + iemail);
		System.out.println("Customer Id: " + iid);
	}
}

class Invoice12 extends Invoice11 {
	String name;
	String email;
	int id;

	Invoice12(String iname, String iemail, int iid) {
		super(iname, iemail, iid);
		name = iname;
		email = iemail;
		id = iid;
	}

	void show3(String iname, String iemail, int iid) {
		System.out.println("Invoice3:");
		System.out.println("Customer Name: " + iname);
		System.out.println("Email: " + iemail);
		System.out.println("Customer Id: " + iid);
	}
}

public class MultileveSameVariableDatatype1 {
	public static void main(String[] args) {
		Invoice12 o = new Invoice12("Rakesh", "rakesh@gta.com", 98);
		o.show1("Ramesh", "rakesh@gta.com", 97);
		o.show2("Suresh", "rakesh@gta.com", 96);
		o.show3("Kalmesh", "rakesh@gta.com", 95);
	}
}
