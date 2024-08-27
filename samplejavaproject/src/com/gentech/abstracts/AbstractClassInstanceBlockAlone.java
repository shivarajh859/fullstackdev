package com.gentech.abstracts;
abstract class Person2 
{
    abstract void personDetails(String name, String job, int personId);
}
class PersonDetails extends Person2 
{

    {
        String personName = "Rakesh";
        String job = "Data Analyst";
        int personId = 80889;
        System.out.println("Person Name: " + personName);
        System.out.println("Person Job: " + job);
        System.out.println("Person Id: " + personId);
        System.err.println("--------------");
    }
   
    {
        String personName = "Ravi";
        String job = "Accountant";
        int personId = 80884;
        System.out.println("Person Name: " + personName);
        System.out.println("Person Job: " + job);
        System.out.println("Person Id: " + personId);
        System.err.println("--------------");
    }

    {
        String personName = "Kiran";
        String job = "Developer";
        int personId = 80886;
        System.out.println("Person Name: " + personName);
        System.out.println("Person Job: " + job);
        System.out.println("Person Id: " + personId);
    }

    void personDetails(String name, String job, int personId) 
    {
        System.out.println("Person Name: " + name);
        System.out.println("Person Job: " + job);
        System.out.println("Person Id: " + personId);
    }

}
public class AbstractClassInstanceBlockAlone {
    public static void main(String[] args) {
        PersonDetails o = new PersonDetails();
        System.out.println("-------------------");
        o.personDetails("Amit", "Manager", 80900);
    }
}
