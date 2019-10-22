package com;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Object, Object> hm = new TreeMap<>();

		hm.put("test", "Abc");
		hm.put("name", "Praveen");
		hm.put("city", "Bangalore");
		hm.put("bla", 4874);
		hm.put("hdssd", "dkjg");
		hm.put("apple", "Xyz");
		hm.put("dell", "Praveen");

		System.out.println(hm);
		Set<Object> keys = hm.keySet();

		for (Object key : keys) {
			
			System.out.println(key);
		}

	}

}
