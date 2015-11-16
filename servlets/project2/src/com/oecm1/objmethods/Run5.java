package com.oecm1.objmethods;
class Engine
{
	int cc;
	Engine(int c)
	{
		cc=c;
	}
	@Override
	public boolean equals(Object arg0)
	{
		if(arg0==null) return false;
		if(!(arg0 instanceof Engine)) return false;
		return cc==((Engine) arg0).cc;
	}
}

class Car
{
	double price;
	Engine eng;
	Car(double p,Engine e)
	{
		price=p;
		eng=e;
	}
	@Override
	public boolean equals(Object arg0)
	{
		if(arg0==null) return false;
		if(!(arg0 instanceof Car)) return false;
		Car c=(Car) arg0;
		return price==c.price && eng.equals(c.eng);
	}
}
public class Run5 {

	public static void main(String[] args) {
		
		Car c1=new Car(500000,new Engine(1000));

		Car c2=new Car(500000,new Engine(1000));
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));


	}

}
