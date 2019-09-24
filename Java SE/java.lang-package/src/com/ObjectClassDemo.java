package com;

import java.io.PrintStream;

public class ObjectClassDemo {
	/*
	 * Notes
	 * -------
	 * Object class
	 * ----------------
	 * -> Object class is the super class to all the classes by default
	 * -> This class contains methods which are common to any class
	 *    in java
	 *    
	 *    Few methods
	 *    ------------
	 *    1. toString
	 *    -> By default JVM calls this method on every object invocation
	 */
	

	public static void main(String[] args) {
		
	
		
		Employee emp=new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(384384);
		
		Employee emp1=new Employee();
		
		emp1.setEmpId(11);
		emp1.setEmpName("Ozvitha");
		emp1.setSalary(863488);
		
		System.out.println(emp);
		System.out.println(emp1);
		
		

	}

}
