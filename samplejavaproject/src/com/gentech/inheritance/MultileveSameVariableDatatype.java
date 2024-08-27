package com.gentech.inheritance;

class Invoice4 
{
    String name;
    String email;
    int id;
    Invoice4(String iname, String iemail, int iid) 
    {
        name = iname;
        email = iemail;
        id = iid;
    }
    void show1(String iname, String iemail, int iid) 
    {
        System.out.println("Invoice1:");
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Customer Id: " + id);
    }

}

class Invoice5 extends Invoice4 {
    Invoice5(String iname, String iemail, int iid) 
    {
        super(iname, iemail, iid);        
        name = iname;
		email = iemail;
		id = iid;
    }

    void show2(String iname, String iemail, int iid) 
    {
        System.out.println("Invoice2:");
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Customer Id: " + id);
    }
}
class Invoice6 extends Invoice5 
{
    Invoice6(String iname, String iemail, int iid) 
    {
        super(iname, iemail, iid);
        super.show1(iname, iemail, iid);
        name = iname;
		email = iemail;
		id = iid;     
    }
    void show3(String iname, String iemail, int iid) {
        System.out.println("Invoice3:");
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Customer Id: " + id);
    }
}
public class MultileveSameVariableDatatype {
    public static void main(String[] args) {
        Invoice6 o = new Invoice6("Rakesh", "rakesh@gta.com", 98);
        o.show1("Kalmesh", "kalmesh@gta.com", 97);
        o.show2("Suresh", "suresh@gta.com", 96);
        o.show3("Ramesh", "ramesh@gta.com", 95);
    }
}
