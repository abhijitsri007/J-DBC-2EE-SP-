package com.oecm1.stringclass;

public class emp {
	String name;
	int id;
	public emp(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "emp [name=" + name + ", id=" + id + "]";
	}
	public boolean equals(Object arg0)
	{
		emp e=(emp)arg0;
		return id==e.id && name.equals(e.name);
	}
}
