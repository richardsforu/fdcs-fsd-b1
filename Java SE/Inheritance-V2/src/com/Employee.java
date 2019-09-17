package com;

public class Employee {

	private int empId;
	private String employeeType;
	private String empName;
	private double salary;

	public void processSalary() {
		salary = salary * 2;
	}

	public void display() {
		System.out.println("Employeement Type: "+employeeType);
		System.out.println("EmployeeId: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("-----------------------");
	}
	
	

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

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
