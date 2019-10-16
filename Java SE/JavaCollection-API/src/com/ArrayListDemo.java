package com;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<>();

		Employee e1 = new Employee(10, "James", 39439);
		Employee e2 = new Employee(10, "James", 39439);

		// add
		al.add("Abc");
		al.add(378463);
		al.add('A');

		al.add(true);
		al.add(3);
		al.add(e1);
		al.add(e2);
		al.add(new Object());

		System.out.println(al);
		// find content
		System.out.println(al.get(2)); // index

		// AL Operations

		System.out.println(al.size());

		// delete object
		al.remove(2); // index

		System.out.println(al);
		System.out.println(al.size());

		al.remove(new Integer(3)); // content

		System.out.println(al);
		System.out.println(al.size());

		// replace

		al.set(3, "Praveen");

		System.out.println(al);

	}

}
