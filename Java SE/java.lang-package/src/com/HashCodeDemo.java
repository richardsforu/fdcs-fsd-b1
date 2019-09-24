package com;

public class HashCodeDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(10, "Praveen", 10000);
		Employee e2 = new Employee(10, "Praveen", 10000);
		
		System.out.println("Identity Code of e1: "+System.identityHashCode(e1));
		System.out.println("Identity Code of e2: "+System.identityHashCode(e2));
		
		System.out.println("hashcode of e1: "+e1.hashCode());
		System.out.println("hashcode of e2: "+e2.hashCode());
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e2));
		
		if (e1.equals(e2)) {
			System.out.println("Equls");
		} else {
			System.out.println("Not Equals");
		}

	}

}
