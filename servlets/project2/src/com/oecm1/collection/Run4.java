package com.oecm1.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Run4 {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(10);
		q.add(5);
		q.add(8);
		q.add(2);
		
		/*System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println("size:"+q.size());*/
	
		while(q.peek()!=null)
		{
			System.out.println(q.poll());
		}
		System.out.println("size:"+q.size());
		
	}

}
