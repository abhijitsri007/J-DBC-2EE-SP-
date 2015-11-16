		package com.oecm1.objmethods;

		class Rect
		{
			int length;
			int breadth;
			public boolean equals(Object arg0)
			{
				/*int h1=height;
				//int h2=this.height;
				//int h2=arg0.height////upcasted so downcast first
				//Tree t=(Tree) arg0;//downcasted
				//int h2=t.height;
				int h2=((Tree) arg0).height;
				return h1==h2;*/
				if(arg0==null) return false;
				if(!(arg0 instanceof Rect)) return false;

				return (length==((Rect) arg0).length && breadth==((Rect) arg0).breadth);
				
			}
			Rect(int l,int b)
			{
				length=l;
				breadth=b;
			}
		}


		public class Run4 {

			public static void main(String[] args) 
			{
				Rect r1=new Rect(10,20);

				Rect r2=new Rect(10,20);
				System.out.println(r1==r2);
				System.out.println(r1.equals(r2));
			}

		}
