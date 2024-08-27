package com.gentech.noargs;

class TwoWheeler
{
	String twoWheelerName;
	int twoWheelerNo;
	TwoWheeler()
	{
		twoWheelerName="Motorbike";
		twoWheelerNo=200;
		System.out.println("TwoWheeler Name :"+ twoWheelerName);
		System.out.println("TwoWheeler NO :"+ twoWheelerNo);
		System.out.println("---------------------------");	
	}
}
class FourWheeler
{
	String fourWheelerName;
	int fourWheelertNo;
	FourWheeler()
	{
		fourWheelerName="Car";
		fourWheelertNo=440;
		System.out.println("FourWheeler Name "+ fourWheelerName);
		System.out.println("FourWheeler NO "+ fourWheelertNo);
		System.out.println("---------------------------");
	}
}
class HeavyVechical
{
	String heavyVechicalName;
	int heavyVechicalNo;
	HeavyVechical()
	{
		heavyVechicalName="Truck";
		heavyVechicalNo=7878;
		System.out.println("HeavyVechical Name "+ heavyVechicalName);
		System.out.println("HeavyVechical NO "+ heavyVechicalNo);
	}
}

public class Vehicals1 {
	public static void main(String[] args) {

		TwoWheeler twowheel=new TwoWheeler();
		FourWheeler fourwheel=new FourWheeler();
		HeavyVechical heavyVehical=new HeavyVechical();
	}
}
