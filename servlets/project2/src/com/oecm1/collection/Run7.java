package com.oecm1.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Run7 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(3);
		a.add(1);
		a.add(5);
		
		Collections.sort(a,new Desc());
		
		System.out.println(a);
		

	}

}

class Desc implements Comparator<Object>
{
	public int compare(Object arg0,Object arg1)
	{
		return (Integer)arg1-(Integer)arg0;
	}
}