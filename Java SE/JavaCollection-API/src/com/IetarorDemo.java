package com;

import java.util.ArrayList;
import java.util.Iterator;

public class IetarorDemo {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<>();

		// add
		al.add("Abc");
		al.add(378463);
		al.add('A');
		al.add(true);
		al.add("Praveen");
		al.add(3);

		// Iterator

		Iterator<Object> it = al.iterator();

		while (it.hasNext()) {
			Object obj=it.next();
			if(obj.equals("Praveen")) {
				it.remove();
				continue;
			}
			System.out.println(obj);
		}
		
		System.out.println(al);

	}

}
