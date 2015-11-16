package com.oecm1.collection;
import java.util.Arrays;
//import java.util.Comparator;

public class Run13 {

	public static void main(String[] args) {
		Emp[] a=new Emp[3];
		a[0]=new Emp("ram",1);
		a[1]=new Emp("shyam",2);
		a[2]=new Emp("gyan",3);
		Arrays.sort(a,new IDComp());


	}

}
class Emp<Emp>
{
	String name;
	int id;
	Emp(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
}
interface Comparator<T>
{
	int compare(T arg0,T arg1);
	
}
class IDComp implements Comparator<Emp>
{
	
	public int compare(Emp arg0,Emp arg1)
	{
		return arg0.id-arg1.id;
	}
}