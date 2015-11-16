package com.oecm1.collection;

import java.util.ArrayList;

public class Run11 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("java");
		//a.add(10);compiletime err
		
		String s1=a.get(0);
		System.out.println(s1);
	}

}
