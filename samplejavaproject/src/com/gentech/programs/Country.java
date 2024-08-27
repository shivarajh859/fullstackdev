package com.gentech.programs;

class Country1
{
	String country1Name;

}
class State
{
	String stateName;

}
class District
{
	String districtName;

}
class Village
{
	String villageName;
	int pincode;
}


public class Country {

	public static void main(String[] args) {
		Country1 c=new Country1();

		c.country1Name="India";
		System.out.println("Country Name:"+c.country1Name);
		State s=new State();
		s.stateName="Karnataka";
		System.out.println("State Name:"+s.stateName);
		District d=new District();
		d.districtName="Bangalore";
		System.out.println("District Name:"+d.districtName);
		Village v=new  Village();
		v.villageName="Attiguppe";
		v.pincode=560093;
		System.out.println("Village Name:"+v.villageName);
		System.out.println("Pincode:"+v.pincode);







	}

}
