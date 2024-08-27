package com.gentech.programs;



class Human
{
	String firstName;
	int age;

}
class Porduct
{
	String productName;
	String orderName;
}
class Birds
{
	String feathercolor;
	int noofwings;
}
class DomesticAnimal
{

	String breadName;
	String quntityofmilkprovides;
}
public class Person1 {
	public static void main(String[] args) {
		Human santhu=new Human();
		santhu.firstName="Santhos";
		santhu.age=22;
		System.out.println("firstName:"+santhu.firstName);
		System.out.println("Age:"+santhu.age);
		System.out.println("-------------------------------");
		Porduct iphone=new Porduct();
		iphone.productName="iphone 15 pro";
		iphone.orderName="Latest iphone";
		System.out.println("productName:"+iphone.productName);
		System.out.println("orderName:"+iphone.orderName);
		System.out.println("--------------------------------");
		Birds sparrow=new Birds();
		sparrow.feathercolor="Gray color";
		sparrow.noofwings=12;
		System.out.println("Feather color:"+sparrow.feathercolor);
		System.out.println("no of wings:"+sparrow.noofwings);
		System.out.println("---------------------------------");
		DomesticAnimal cow=new DomesticAnimal();
		cow.breadName="Jersey";
		cow.quntityofmilkprovides="10 Liters";
		System.out.println("Bread Name:"+cow.breadName);
		System.out.println("Quntity of Milk Provides:"+cow.quntityofmilkprovides);


	}

}
