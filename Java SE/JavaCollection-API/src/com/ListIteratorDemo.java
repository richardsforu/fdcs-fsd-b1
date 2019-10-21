package com;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<>();

		// add
		al.add("Abc");
		al.add(378463);
		al.add('A');
		al.add(true);
		al.add("Praveen");
		al.add(3);
		
		System.out.println(al);

		ListIterator<Object> li = al.listIterator();

		while (li.hasNext()) {
			Object obj = li.next();
			if(obj.equals("Praveen")) {
				//li.set("Priya");
				//li.add("SOmething");
				li.remove();
			}
			//System.out.println(obj);
		}
		System.out.println("------------------");
		
		System.out.println(al);

	
	}

}
