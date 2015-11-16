package com.oecm1.linkedlist;

public class Test {
	
	public static void main(String args[])
	{
		MyLinkedList list=new MyLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Node head=list.reverse(list);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
