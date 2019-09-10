package com;

public class Use {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		e1.setEmployeeData(100,"Praveen",47674); // actual argument
		e2.setEmployeeData(101,"James",46757); // actual argument
		e3.setEmployeeData(102,"Bucky",97595); // actual argument

		
		e1.display();
		e2.display();
		e3.display();

	}

}
