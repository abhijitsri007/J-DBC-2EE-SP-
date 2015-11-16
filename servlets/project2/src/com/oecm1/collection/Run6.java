package com.oecm1.collection;

//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Run6 {

	public static void main(String[] args) {
		//Set s=new HashSet();
		//Set s=new LinkedHashSet();
		Set<String> s=new TreeSet<String>();
		s.add("java");
		s.add("mava");
		s.add("bava");
		//s.add("java");
		s.add("kava");
		System.out.println("size:"+s.size());
		
		for(Object x:s)
		{
			System.out.println(x);
		}

	}

}
