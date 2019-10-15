package com;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 66;
	
	
	private int empId;
	private String empName;
	private double salary;
	transient String info = "Info about this employee";
	
	void f1() {}
	int x;
	
	void f2() {}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
