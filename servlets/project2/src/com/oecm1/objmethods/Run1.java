package com.oecm1.objmethods;

class Emp
{
	String name;
	int id;
	Emp(String name,int id)
	{
		this.name=name;
		this.id=id;
	}


	@Override
	public String toString()
	{
		return "Emp["+name+","+id+"]";
	}
}
public class Run1 {

	public static void main(String[] args) {
		Emp e1=new Emp("Raju",100);
		System.out.println(e1);//toString() is implicitly
								//invoked

	}

}
