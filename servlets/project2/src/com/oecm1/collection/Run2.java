package com.oecm1.collection;

import java.util.ArrayList;

public class Run2																																																																					 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(5);
		a.add(20);
		a.add(15);
		
		System.out.println(a);
		int i=(Integer)a.get(0);
		System.out.println(i);
		
		for(Object x:a)
		{
			System.out.println(x);
		}
		a.add(1,25);
		System.out.println(a);
		
		a.set(2,30);
		System.out.println(a);
		
		a.remove(3);
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
		

	}

}
