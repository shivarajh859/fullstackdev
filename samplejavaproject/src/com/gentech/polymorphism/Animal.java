package com.gentech.polymorphism;
abstract class Animal1
{
	abstract void sound(); 
}
class Dog extends  Animal1
{
	void sound()
	{

		String sound="Barks";
		String eat="Pedigere";
		System.out.println("Dog will eat:"+eat);
		System.out.println(" Dog  makes a sound:"+sound );
	}
}
class Cat extends  Animal1
{
	void sound()
	{
		String sound="Meow!";
		String drink="Milk";
		System.out.println("Cat will drink:"+drink);
		System.out.println(" Cat  makes a sound:"+sound );

	}
}
class  Cow extends Animal1
{
	void sound()
	{
		String sound="Moooo!";
		String eat="Vegitables, Grass";
		System.out.println("Cow will eat:"+eat);
		System.out.println(" Cow  makes a sound:"+sound );

	}
}

public class Animal {
	public static void main(String[] args) {
		Animal1 o=null;
		Dog dog=new Dog();
		Cat cat=new Cat();
		Cow cow=new Cow();
		o=dog;
		o.sound();
		
		o=cat;
		o.sound();
		
		o=cow;
		o.sound();

	}

}
