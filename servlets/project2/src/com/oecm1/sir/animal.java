package com.oecm1.sir;

public interface animal {
	void makesound();
}

class Cat implements animal
{
	public void makesound()
	{
		System.out.println("cat makes sound");
	}

	@Override
	public String toString() {
		return "Cat [getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
class Dog implements animal
{
	public void makesound()
	{
		System.out.println("dog make sounds");
	}

	@Override
	public String toString() {
		return "Dog [getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
