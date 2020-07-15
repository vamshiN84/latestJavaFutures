package com.java.latest;

public class Employee {
	private int eno;
	private String eName;
	private double salary;

	public Employee(int eno, String eName, double salary) {
		super();
		this.eno = eno;
		this.eName = eName;
		this.salary = salary;
	}
	public Employee(int eno, String eName) {
		super();
		this.eno = eno;
		this.eName = eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", eName=" + eName + ",salary=" + salary + "]";
	}
	

}
