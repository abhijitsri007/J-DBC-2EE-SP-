package org.oejm1.dbapp;

public class EmployeeDTO {
	/*state/property/instance var/data members*/
	
	private int id;
	private String dept;
	private String name;
	private double sal;
	public int getEid() {
		return id;
	}
	public void setEid(int eid) {
		this.id = eid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	

}
