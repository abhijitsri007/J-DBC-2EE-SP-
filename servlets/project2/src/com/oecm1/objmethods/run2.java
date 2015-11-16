package com.oecm1.objmethods;

class Tree
{
	int height;
	int length;
	public boolean equals(Object arg0)
	{
		/*int h1=height;
		//int h2=this.height;
		//int h2=arg0.height////upcasted so downcast first
		//Tree t=(Tree) arg0;//downcasted
		//int h2=t.height;
		int h2=((Tree) arg0).height;
		return h1==h2;*/
		return (height==((Tree) arg0).height && length==((Tree) arg0).length);
		
	}
	Tree(int h,int l)
	{
		height=h;
		length=l;
	}
}


public class run2 {

	public static void main(String[] args) 
	{
		Tree t1=new Tree(10,20);

		Tree t2=new Tree(10,20);
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
	}

}
