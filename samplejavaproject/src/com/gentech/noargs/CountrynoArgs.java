package com.gentech.noargs;

class Country1
{
	String country1Name;
	Country1()
	{
		country1Name="India";
		 
		System.out.println("Country Name:"+ country1Name);
	}

}
class State
{
	String stateName;
	State()
	{
		stateName="Karnataka";
		System.out.println("State Name:"+ stateName);
	}

}
class District
{
	String districtName;
	District()
	{
		districtName="Bangalore";
		System.out.println("District Name:"+ districtName);
	}

}
class Village
{
	String villageName;
	int pincode;
	Village()
	{
		villageName="Attiguppe";
		pincode=560093;
		System.out.println("Village Name:"+ villageName);
		System.out.println("Pincode:"+ pincode);
	}
}

public class CountrynoArgs {

	public static void main(String[] args) {
		
		Country1 c=new Country1();
		State s=new State();
		District d=new District();
		Village v=new  Village();

	}

}
