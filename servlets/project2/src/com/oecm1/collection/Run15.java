package com.oecm1.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Run15 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		ListIterator<Integer> listItr=a.listIterator();
		while(listItr.hasNext())
		{
			System.out.println(listItr.next());
		}
		while(listItr.hasPrevious())
		{
			System.out.println(listItr.previous());
		}
	}

}
