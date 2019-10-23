package com;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;

public class Employee implements Serializable, Comparable<Employee>, Comparator<Employee> {

	private static final long serialVersionUID = 1L;

	private int empId;
	private String empName;
	private double salary;
	private LocalDate dob;
	private int age;

	public Employee() {
	}

	public Employee(int empId, String empName, double salary, LocalDate dob) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dob = dob;
		// -- calculate age
		Period period = Period.between(getDob(), LocalDate.now());
		this.age = period.getYears();
	}

	@Override
	public int compareTo(Employee emp) {

		return empId - emp.getEmpId();
	}

	@Override
	public int compare(Employee emp1, Employee emp2) {

		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}

	public static void display(List<Employee> emps) {

		System.out.println("EmpId\tName\tSalary\tDOB\t\tAge");
		System.out.println("----------------------------------------------");

		for (Employee emp : emps) {
			System.out.print(emp.getEmpId() + "\t");
			System.out.print(emp.getEmpName() + "\t");
			System.out.print(emp.getSalary() + "\t");
			System.out.print(emp.getDob() + "\t");

			System.out.print(emp.getAge());

			System.out.println();
		}
		System.out.print("------------------------------------------------");
	}

	public void calculateAge() {
		Period period = Period.between(getDob(), LocalDate.now());
		this.age = period.getYears();
	}
	public int getAge() {
		return age;
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {

		this.dob = dob;

	}

}
