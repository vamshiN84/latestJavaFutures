package com.vamshi.java8.streams.pojo;

public class Employee {
	private String empName;
	private Integer empId;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	public Employee(String empName, Integer empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + "]";
	}
	

}
