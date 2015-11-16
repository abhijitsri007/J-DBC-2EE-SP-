package com.oecm1.collection;

import java.util.HashSet;
import java.util.Set;

public class Run8 {

	public static void main(String[] args) {
		Set<Student> s=new HashSet<Student>();
		s.add(new Student("kiran",101,5,"whitefield"));
		s.add(new Student("derik",104,7,"oar"));
		s.add(new Student("kiran",101,5,"WHITEFIELD"));
		s.add(new Student("bharat",105,5,"oar"));
		s.add(new Student("sunny",101,5,"marathali"));
	
		System.out.println("size:"+s.size());
		for(Object stu:s)
		{
			System.out.println(stu);
		}
	}

}
class Student
{
	String name;
	int id;
	int std;
	String address;
	Student(String name,int id,int std,String address)
	{
		this.name=name;
		this.id=id;
		this.std=std;
		this.address=address;
	}
	

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", std=" + std
				+ ", address=" + address + "]";
	}



	public boolean equals(Object arg0)
	{
		Student s=(Student)arg0;
		return name.equalsIgnoreCase(s.name) && id==s.id && std==s.std && address.equalsIgnoreCase(s.address);
	}
	public int hashCode()
	{
		//return std;//generating hashcode according to std
		return name.hashCode();//generating hashcode according to name
	}
	
}