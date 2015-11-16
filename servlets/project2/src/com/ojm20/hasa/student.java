package com.ojm20.hasa;

public class student {
	String name;
	int rollNo;
	Address adr;
	
	
	public student(String name,int rollNo,Address adr)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.adr=adr;
		
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("RollNo:"+rollNo);
		System.out.println("Address:");
		adr.display();
	}
	

}
