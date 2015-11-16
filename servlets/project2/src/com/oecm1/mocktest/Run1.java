package com.oecm1.mocktest;

public class Run1 
{

	public static void main(String[] args) 
	{
		Raveesh r=new Student2();
		r.learnJava();
		r.learnJ2ee();
		r.learnJDBC();
		r.learnAndroid();
		r.attainPlacement();
	
	}

}
interface Raveesh
{
	public void learnJava();
	public void learnJ2ee();
	public void learnJDBC();
	public void learnAndroid();
	public void attainPlacement();
	
}
class Student1 implements Raveesh
{
	public void learnJava()
	{
		System.out.println("student1 learns java ");
	}
	public void learnJ2ee()
	{
		System.out.println("student1 learns j2ee");
	}
	public void learnJDBC()
	{
		System.out.println("student1 learns jdbc");
	}
	public void learnAndroid()
	{
		System.out.println("student1 learns android");
	}
	public void attainPlacement()
	{
		System.out.println("student1 cracks the drive");
	}

}
class Student2 implements Raveesh
{
	public void learnJava()
	{
		System.out.println("student2 learns java ");
	}
	public void learnJ2ee()
	{
		System.out.println("student2 learns j2ee");
	}
	public void learnJDBC()
	{
		System.out.println("student2 learns jdbc");
	}
	public void learnAndroid()
	{
		System.out.println("student2 learns android");
	}
	public void attainPlacement()
	{
		System.out.println("student2 cracks the drive");
	}

	
}
