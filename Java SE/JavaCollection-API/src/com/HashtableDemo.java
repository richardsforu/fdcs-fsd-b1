package com;

import java.util.Hashtable;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {

		Hashtable<Object, Object> hm = new Hashtable<>();

		hm.put(101, "Abc");
		hm.put("name", "Praveen");
		hm.put("city", "Bangalore");
		hm.put(65.34f, 4874);
		hm.put(101, "Xyz");
		hm.put("user", "Praveen");
		//hm.put(null, "bla");
		//hm.put(4864, null);
		//hm.put(null, null);

		System.out.println(hm);

		System.out.println(hm.get("city"));

		// hm.remove("user");
		System.out.println(hm);

		// hm.clear();

		System.out.println(hm.size());

		System.out.println("----------------------");

		// ----------------------------------------

		// copy all keys into set

		Set<Object> keys = hm.keySet();
		
		for (Object key : keys) {
			
			System.out.println(hm.get(key));
		}

		System.out.println("-----------------");

		// copy key and value of map into set

		Set data = hm.entrySet();

		for (Object obj : data) {
			System.out.println(obj);
		}

	}

}
