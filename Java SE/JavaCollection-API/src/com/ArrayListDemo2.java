package com;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<>();

		// add
		al.add("Abc");
		al.add(378463);
		al.add('A');
		al.add(true);
		al.add("Praveen");
		al.add(3);
		al.add(378463);
		
		LinkedHashSet<Object> hs=new LinkedHashSet<>(al);
		System.out.println(hs);
		
		
		
		// Listing data from collection
		
		/*
		 * 5 ways
		 * 	-> for loop (indexed based ops)
		 * 	-> for each (just to display content)
		 * 	-> Iterator interface
		 * 	-> ListIterator interface
		 * 	-> Enumerator interface
		 */
		
		// 1 for loop
		
		
		
		for(int i=0;i<al.size();i++) {
			if(al.get(i).equals("Praveen")) {
				//al.set(i, "James");
				//al.add("Kavya");
				//al.remove(i);
				
			}
			//System.out.println(al.get(i));
		}
		
		//System.out.println(al);

		// for eac h
		
		for(Object obj:al) {
			if(obj.equals("Praveen")) {
				//al.add("James");
				//al.remove(obj);
			}
			//System.out.println(obj);
		}
		
		System.out.println(al);
	
		
	}

}
