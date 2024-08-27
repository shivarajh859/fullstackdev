package com.gentech.polymorphism;
abstract class  Food1
{
	abstract void serveFood(); 
}
class HotelFood extends  Food1
{
	void serveFood()
	{		
		String foodate="Dosa";
		int foodamount=50;
		System.out.println("Food ate in Hotel:"+foodate);
		System.out.println("  Food amount:"+foodamount);
	}
}
class HomeFood extends  Food1
{
	void serveFood()
	{
		String foodate="Puri";
		int foodamount=0;
		System.out.println("Food ate in Hotel:"+foodate);
		System.out.println("  Food amount:"+foodamount);
	}
}
class Restaurant extends  Food1
{
	void serveFood()
	{
		String foodate="Biriyani";
		int foodamount=100;
		System.out.println("Food ate in Restaurant:"+foodate);
		System.out.println("  Food amount:"+foodamount);
	}
}
class OutSideOrderFood extends  Food1
{
	void serveFood()
	{
		String foodate="Pizza";
		int foodamount=1000;
		System.out.println("Food ate in OutSideOrderFood:"+foodate);
		System.out.println("  Food amount:"+foodamount);
	}
}
public class Food {
	public static void main(String[] args) {
		Food1 food=null;
		HotelFood hotel=new HotelFood();
		HomeFood home=new HomeFood();
		Restaurant restaurant=new Restaurant();
		OutSideOrderFood out=new OutSideOrderFood();
		
		food=hotel;
		food.serveFood();
		
		food=home;
		food.serveFood();
		
		food=restaurant;
		food.serveFood();
		
		food=out;
		food.serveFood();
		
		
	}

}
