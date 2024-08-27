package com.gentech.parameters;

class Product1
{
	String productName;
	int productPrice;
	int  productNo;
	Product1(String prName,int prPrice,int  prNo)
	{
		productName=prName;
		productPrice=prPrice;
		productNo=prNo;
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
	Sales(String prName,int prNo)
	{
		productName=prName;
		productNo=prNo;
		System.out.println("Product Saled:"+productName);
		System.out.println("Product No:"+productNo);	
	}
}
class Order
{
	String orderName;
	int orderNo;
	Order(String oName,int oNo)
	{
		orderName=oName;
		orderNo=oNo;
		System.out.println("---------------");
	}
}
class Inventory
{
	String inventoryName;
	Inventory(String invName)
	{
		inventoryName=invName;
		System.out.println("Inventory Name:"+inventoryName);
	}

}


public class ProductWithArgs {

	public static void main(String[] args) {

		Product1 p=new Product1("Laptop",90000,55);
		Product1 p1=new Product1("Phone",45000,780);
		Product1 p2=new Product1("Bag",500,50);
		Sales s=new Sales("Laptop",2);
		Sales s1=new Sales("Bag",50);
		Order o=new Order("Watch",4895);
		Order o2=new Order("Phone",995);
		Order o3=new Order("Book",45);
		Inventory i=new Inventory("Amazon");
		Inventory i2=new Inventory("FilpKart");
		Inventory i1=new Inventory("Myntra");
		


	}

}
