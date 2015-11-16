package com.oecm1.linkedlist;


public class MyLinkedList {
	
	private Node start;
	private int count=0;
	public void add(int element)
	{	
		count++;
		if (start==null) {
			start=new Node(element);
			return;
		}
		Node p=start;
		while(p.next!=null){
			p=p.next;
		}
		p.next=new Node(element);
	}
	
	public int get(int index)
	{
		if(index==0) return start.i;
		
		Node p=start;
		for(int k=1; k<=index; k++){
			p=p.next;
		}
		return p.i;
	}
	
	public int size()
	{
		return count;
	}
	private class Node
	{
		int i;
		Node next;
		Node(int i){
			this.i=i;
		}
	}
	
	public Node reverse()
	{
		
		Node cur=start;
		Node temp=null;
		
		Node next;
		Node prev=null;
		
		while(cur!=null)
		{
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		return prev;
		
	}
}




