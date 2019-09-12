package com;

public class Employee {

	private int empId;
	private String empName;
	private double salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		// ----

		this.empId = empId;
	}

	public String getEmpName() {
		// ----
		//
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		// --- calculations
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Empid: " + empId);
		System.out.println("name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("----------------------");
	}

}
