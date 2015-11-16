package com.oecm1.collection;

import java.util.ArrayList;
import java.util.List;

public class Run3 {

	public static void main(String[] args) {
		
			ArrayList<Integer> a=new ArrayList<Integer>();
			a.add(10);
			a.add(30);
			a.add(20);
			a.add(15);

			System.out.println(a.indexOf(15));
			
			a.remove(new Integer(6));
			System.out.println(a);
			
			Object[] arr=a.toArray();
			System.out.println(arr);
			
			List<Integer> b=a.subList(1,3);
			System.out.println(b);
	}

}
