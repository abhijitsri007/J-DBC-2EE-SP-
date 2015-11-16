package com.oecm1.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Run14 {

	public static  void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		Iterator<Integer> itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
			
	}

}
