package com.oecm1.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Run9 {

	public static void main(String[] args) {
		String s1="hello";
		Set<Character> s=new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			s.add(s1.charAt(i));
			{
				for(Object x:s)
				{
					System.out.print(x);
				}
			}
		}

	}

}
