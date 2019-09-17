package com;

public class RegularEmployee extends Employee {

	private int numberOfDaysWorked;

	public RegularEmployee(int numberOfDaysWorked) {
		this.numberOfDaysWorked = numberOfDaysWorked;
	}

	public int getNumberOfDaysWorked() {
		return numberOfDaysWorked;
	}

	public void setNumberOfDaysWorked(int numberOfDaysWorked) {

		this.numberOfDaysWorked = numberOfDaysWorked;
	}

	@Override
	public void processSalary() {

		this.setSalary(numberOfDaysWorked * 7500);
	}

}
