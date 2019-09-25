package com;

class Student {
	int id;
	String name;
	int marks;
}

public class StringDemo {

	/*
	 * String ----------
	 * 
	 * Types of Objects ---------------- 
	 * 1. Immutable -> Content of object can not be changed 
	 *    EX: String and all wrapper classes 
	 * 2. Mutable -> content of object can be changed 
	 *    Ex: StringBuffer, StringBuilder .. etc
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String s1 = "Abc";
		System.out.println("S1: " + s1);
		System.out.println("S1 hashcode: " + System.identityHashCode(s1));

		String s2=new String("Abc");
		
		System.out.println("S2: " + s2);
		System.out.println("S2 hashcode: " + System.identityHashCode(s2));
		
		
		if(s1.equals(s2)) {
			System.out.println("Equals");
		}else {
			System.out.println("Not Equals");
		}
		
		


	}

}
