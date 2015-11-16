package com.oecm1.collection;
import java.util.Iterator;
import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.Set;



public class Run16 {

	public static void main(String[] args) {
		Map<String, Integer> m=new HashMap<String, Integer>();//for TreeMap-sorting order,for LinkedHashMap-insertion order,for hashMap-default order
		m.put("physics", 55);
		m.put("maths", 60);
		m.put("english", 64);
		m.put("java", 124);
		System.out.println(m);
		System.out.println("maths: "+m.get("maths"));
		
		//Set s=m.keySet();
		//Iterator itr=s.iterator();
		
		Iterator<String> itr=m.keySet().iterator();
		while(itr.hasNext())
		{
			Object key=itr.next();
			Object val=m.get(key);
			System.out.println(key+"="+val);
		}

	}

}
