package com;

public class Use {

	public static void main(String[] args) {
	
		
		
		Employee emp;
		
		emp=new RegularEmployee(22);
		emp.setEmployeeType("Regular");
		emp.setEmpId(10);
		emp.setEmpName("James");
		
		emp.processSalary();
		emp.display();
		
		emp=new ContractEmployee(120);
		
		emp.setEmployeeType("Contract");
		emp.setEmpId(11);
		emp.setEmpName("Praveen");
		
		emp.processSalary();
		emp.display();
		
		
		
		
		
		

	}

}
