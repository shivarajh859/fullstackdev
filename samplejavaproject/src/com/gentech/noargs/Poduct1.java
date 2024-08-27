package com.gentech.noargs;

class Product1
{
	String productName;
	int productPrice;
	int  productNo;
	Product1()
	{
		productName="Laptop";
		productPrice=90000;
		productNo=55;
		System.out.println("Product Name:"+productName);
		System.out.println("Product Price:"+productPrice);
		System.out.println("Product NO:"+productNo);
		System.out.println("---------------");
	}
}
class Sales
{
	String productName;
	int productNo;
	String productDate;
	
	Sales()
	{
		productName="Laptop";
		productNo=2;
		productDate="24-09-2024";
		System.out.println("Product Saled:"+productName);
		System.out.println("Product No:"+productNo);
		System.out.println("Product Date"+productDate);
	}
}
class Order
{
	String orderName;
	int orderNo;
	String orderDate;
	Order()
	{
		orderName="Phone";
		orderNo=4895;
		orderDate="05-04-2024";
		System.out.println("Order Name :"+orderName);
		System.out.println("Order No:"+ orderNo);
		System.out.println("Order Date"+orderDate);
		System.out.println("---------------");
	}
}
class Inventory
{
	String inventoryName;
	String inventoryName1;
	String inventoryName2;
	Inventory()
	{
		inventoryName="Amazon";
		inventoryName1="FlipKart";
		inventoryName2="Myntra";
		System.out.println("Inventory Name:"+inventoryName);
		System.out.println("Inventory Name:"+inventoryName1);
		System.out.println("Inventory Name:"+inventoryName2);
	}

}

public class Poduct1 {
       
	public static void main(String[] args) {

		Product1 p=new Product1();
		Sales s=new Sales();
		Order o=new Order();
		Inventory i=new Inventory();
		 



	}

}
