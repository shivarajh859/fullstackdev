package com.gentech.parameters;

class TwoWheeler
{
	String twoWheelerName;
	int twoWheelerNo;
	TwoWheeler(String twoWhName,int twoWhNo)
	{
		twoWheelerName=twoWhName;
		twoWheelerNo=twoWhNo;
		System.out.println("TwoWheeler Name: "+ twoWheelerName);
		System.out.println("TwoWheeler NO: "+ twoWheelerNo);
		System.out.println("---------------------------");	
	}
}
class FourWheeler
{
	String fourWheelerName;
	int fourWheelertNo;
	FourWheeler(String fourWhName,int fourWhNo)
	{
		fourWheelerName=fourWhName;
		fourWheelertNo=fourWhNo;
		System.out.println("FourWheeler Name: "+ fourWheelerName);
		System.out.println("FourWheeler NO :"+ fourWheelertNo);
		System.out.println("---------------------------");
	}
}
class HeavyVechical
{
	String heavyVechicalName;
	int heavyVechicalNo;
	HeavyVechical(String heavyVeName,int heavyVeNo)
	{
		heavyVechicalName=heavyVeName;
		heavyVechicalNo=heavyVeNo;
		System.out.println("HeavyVechical Name: "+ heavyVechicalName);
		System.out.println("HeavyVechical NO: "+ heavyVechicalNo);
		System.out.println("---------------------------");
	}
}

public class VehicalsWithArgs {

	public static void main(String[] args) {
		TwoWheeler twowheel=new TwoWheeler("Scooter",26);
		TwoWheeler twowheel1=new TwoWheeler("Bike",28);
		TwoWheeler twowheel2=new TwoWheeler("Electric Scooter",27);
		FourWheeler fourwheel=new FourWheeler("Car",2928);
		FourWheeler fourwheel1=new FourWheeler("Tempo",2927);
		FourWheeler fourwheel2=new FourWheeler("Car",2920);
		HeavyVechical heavyVehical=new HeavyVechical("Truck",7000);
		HeavyVechical heavyVehical1=new HeavyVechical("Bus",7878);
		HeavyVechical heavyVehical2=new HeavyVechical("Train",7800);

	}

}
