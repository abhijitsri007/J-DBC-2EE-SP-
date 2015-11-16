package com.oecm1.array;

import java.util.Arrays;

public class Run10 {

	public static void main(String[] args) {
		Book[] arr=new Book[3];
		arr[0]=new Book("c");
		arr[1]=new Book("c++");
		arr[2]=new Book("java");
		/*for(Book b:arr)
		{
			
			System.out.println(b);
	
		}*/
		System.out.println(Arrays.toString(arr));
	}

}
class Book{
	String title;
	Book(String t)
	{
		title=t;
		
	}
	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
}
