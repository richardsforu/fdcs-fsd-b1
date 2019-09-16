package com;

public class ContractEmployee extends Employee {

	private int noOfHoursWorked;

	public int getNoOfHoursWorked() {
		return noOfHoursWorked;
	}

	public void setNoOfHoursWorked(int noOfHoursWorked) {
		this.noOfHoursWorked = noOfHoursWorked;
	}

	public void processSalary() {
		this.setSalary(noOfHoursWorked * 1000);
	}

}
