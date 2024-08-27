package com.gentech.programs;


class TwoWheeler
{
	String twoWheelerName;
	int twoWheelerNo;
}
class FourWheeler
{
	String fourWheelerName;
	int fourWheelertNo;
}
class HeavyVechical
{
	String heavyVechicalName;
	int heavyVechicalNo;
}
public class Vehicals {

	public static void main(String[] args) {
		TwoWheeler twowheel=new TwoWheeler();
		twowheel.twoWheelerName="Motorbike";
		twowheel.twoWheelerNo=200;
		System.out.println("TwoWheeler Name "+twowheel.twoWheelerName);
		System.out.println("TwoWheeler NO "+twowheel.twoWheelerNo);
		System.out.println("---------------------------");	
		FourWheeler fourwheel=new FourWheeler();
		fourwheel.fourWheelerName="Car";
		fourwheel.fourWheelertNo=440;
		System.out.println("FourWheeler Name "+fourwheel.fourWheelerName);
		System.out.println("FourWheeler NO "+fourwheel.fourWheelertNo);
		System.out.println("---------------------------");
		HeavyVechical heavyVehical=new HeavyVechical();
		heavyVehical.heavyVechicalName="Truck";
		heavyVehical.heavyVechicalNo=7878;
		System.out.println("HeavyVechical Name "+heavyVehical.heavyVechicalName);
		System.out.println("HeavyVechical NO "+heavyVehical.heavyVechicalNo);

	}

}
