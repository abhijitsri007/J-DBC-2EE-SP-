package com.oecm1.collection;

public class Run12 {

	public static void main(String[] args) {
		

	}

}
class Book implements Comparable<Book>
{
	int pages;
	public Book(int pages)
	{
		this.pages=pages;
		
	}
	public int compareTo(Book arg0)
	//public int compareTo(Object arg0)
	{
		//Book b=(Book) arg0;
		return pages-/*b*/arg0.pages;
		
	}
}
