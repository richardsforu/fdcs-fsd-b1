package com;

public class Employee {
	
	int empId;
	String empName;
	double salary;

	void setEmployeeData(int empId,String empName,double salary) { // formal argument
		
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		
	}
	
	static void f1(int empId) {
		Employee emp=new Employee();
		emp.empId=empId;
	}

	void display() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+salary);
		System.out.println("-------------------------------");
	}
	

}
