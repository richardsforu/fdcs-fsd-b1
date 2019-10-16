package com;

import java.util.LinkedList;

public class LinkedKListDemo {

	public static void main(String[] args) {

		LinkedList<Object> al = new LinkedList<>();

		Employee e1 = new Employee(10, "James", 39439);
		Employee e2 = new Employee(11, "Praveen", 38473374);

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

		// -------------------------

		System.out.println("------------");

		for (int i = 0; i < al.size(); i++) {
			Object obj = al.get(i);
			if (obj instanceof Employee) {
				Employee e = (Employee) obj;
				if (e.getEmpId() == 11) {
					al.remove(i);
				}
			}
		}

		// -----
		System.out.println(al);

	}

}
