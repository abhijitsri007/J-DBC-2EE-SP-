package com.oecm1.mocktest;

public class Run7 {

	public static void main(String[] args) {
	G g1=new G();
	g1.i=5;
	
	G g2=new G();
	g2.i=10;
	
	g1.display();
	g2.display();
	}

}
class G
{
	int i;
	void display()
	{
		int i=2;
		System.out.println(this.i);
		System.out.println(i);
	}
}