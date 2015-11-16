package com.oecm1.objmethods;
														
class Book
{
	int pages;
	public boolean equals(Object arg0)
	{
		/*int h1=height;
		//int h2=this.height;
		//int h2=arg0.height////upcasted so downcast first
		//Tree t=(Tree) arg0;//downcasted
		//int h2=t.height;
		int h2=((Tree) arg0).height;
		return h1==h2;*/
		return pages==((Book) arg0).pages;
		
	}
	Book(int p)
	{
		pages=p;
	}
}


public class run3 {

	public static void main(String[] args) 
	{
		Book p1=new Book(10);

		Book p2=new Book(10);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
	}

}
