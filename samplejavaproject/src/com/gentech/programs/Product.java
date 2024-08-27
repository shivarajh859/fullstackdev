package com.gentech.programs;


class Product1
{
	String productName;
	int productPrice;
	int  productNo;
}
class Sales
{
	String productName;
	int productNo;
}
class Order
{
	String orderName;
	int orderNo;
}
class Inventory
{
	String inventoryName;

}


public class Product {

	public static void main(String[] args) {
		Product1 p=new Product1();
		p.productName="Laptop";
		p.productPrice=90000;
		p.productNo=55;
		System.out.println("Product Name:"+p.productName);
		System.out.println("Product Price:"+p.productPrice);
		System.out.println("Product NO:"+p.productNo);
		System.out.println("---------------");
		Sales s=new Sales();
		s.productName="Laptop";
		s.productNo=2;
		System.out.println("Product Saled:"+s.productName);
		System.out.println("Product No:"+s.productNo);
		Order o=new Order();
		o.orderName="Phone";
		o.orderNo=4895;
		System.out.println("Order Name :"+o.orderName);
		System.out.println("Order No:"+o.orderNo);
		System.out.println("---------------");
		Inventory i=new Inventory();
		i.inventoryName="Amazon";
		System.out.println("Inventory Name:"+i.inventoryName);








	}

}
