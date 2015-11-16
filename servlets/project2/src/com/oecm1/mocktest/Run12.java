package com.oecm1.mocktest;

public class Run12 {

	public static void main(String[] args) {
		Car c1=new Car(1111);
		Car c2=new Car(2222);
		new Car(3333);
		Driver d1=new Driver();
		d1.drive(c2);
		d1.drive(c1);
		d1.drive(new Car(3333));

	}

}
class Car
{
	int num;
	public Car(int n)
	{
		num=n;
		
	}
	void start()
	{
		System.out.println(num+"car starts");
	}
	void moves()
	{
		System.out.println(num+"car moves");
	}
	void stops()
	{
		System.out.println(num+"car stops");
	}
}
class Driver
{
	void drive(Car car)
	{
		System.out.println("drive starts");
		car.start();
		car.moves();
		car.stops
		();
		System.out.println("drive stops");
		
	}
	
}
