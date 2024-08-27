package com.gentech.parameters;

class Country1
{
	String country1Name;
	Country1(String cName)
	{
		country1Name=cName;
		System.out.println("Country Name:"+ country1Name);
		System.out.println("----------------------------");
	}
}
class State
{
	String stateName;
	State(String sName)
	{
		stateName=sName;
		System.out.println("State Name:"+ stateName);
		System.out.println("----------------------------");
	}

}
class District
{
	String districtName;
	District(String disName)
	{
		districtName=disName;
		System.out.println("District Name:"+ districtName);
		System.out.println("----------------------------");
	}

}
class Village
{
	String villageName;
	int pincode;
	Village(String vName,int Pincode)
	{
		villageName=vName;
		pincode=Pincode;
		System.out.println("Village Name:"+ villageName);
		System.out.println("Pincode:"+ pincode);
		System.out.println("----------------------------");
	}
}


public class CountryWithArgs {

	public static void main(String[] args) {

		
		Country1 c=new Country1("India");
		Country1 c1=new Country1("USA");
		Country1 c2=new Country1("China");
		State s=new State("Karnataka");
		State s1=new State("Bihar");
		State s2=new State("Delhi");
		District d=new District("Bangalore");
		District d1=new District("Mandya");
		District d2=new District("Shahapur");
		Village v=new  Village("Attiguppe",560003);
		Village v1=new  Village("Vijayanagar",560080);
		Village v2=new  Village("Mejastic",560093);


	}

}
