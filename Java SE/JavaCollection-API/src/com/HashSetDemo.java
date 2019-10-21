package com;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Object> hs = new HashSet<>();

		hs.add("Abc");
		hs.add(34848);
		hs.add(false);
		hs.add('H');
		hs.add(34848);
		hs.add("Praveen");
		hs.add(6363.34f);

		System.out.println(hs);

		// Finding The Data
		Object key = "Praveen";
		boolean found = false;
		for (Object obj : hs) {
			if (obj.equals(key)) {
				found = true;
			}
		}
		// -----------

		if (found) {
			System.out.println(key + " Found in the set");
			//----? 
		} else {
			System.out.println(key + " does not found in the set");
		}
		
		
		Iterator<Object> it=hs.iterator();
		
		while(it.hasNext()) {
			Object obj=it.next();
			if(obj.equals("Praveen")) {
				it.remove();
				//hs.remove(obj);
			}
		}
		
		//----------------
		
		// find and replace
		
		
		
		/*
		for (Object obj : hs) {
			if (obj.equals(key)) {
			
				hs.add("James");
			}
		}
		*/
		//-----------
		
		System.out.println(hs);
		
		
	}

}
