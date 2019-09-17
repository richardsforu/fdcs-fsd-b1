package com;

public class Use {

	public static void main(String[] args) {
	
		
		RegularEmployee re=new RegularEmployee();
		/*
		 * re 
		 * 	1. behavior : -> variable
		 *  2. action : methods
		 */
		
		re.setEmployeeType("Regular");
		re.setEmpId(10);
		re.setEmpName("Praveen");
		//re.setSalary(10000);
		re.setNumberOfDaysWorked(11);
		
		
		ContractEmployee ce=new ContractEmployee();
		
		ce.setEmployeeType("Contract");
		ce.setEmpId(11);
		ce.setEmpName("James");
		ce.setSalary(20000);
		ce.setNoOfHoursWorked(150);
		
		
		ce.processSalary();
		re.processSalary();
		
		re.display();
		ce.display();
		
		

	}

}
