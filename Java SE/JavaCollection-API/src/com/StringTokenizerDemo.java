package com;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String str = "Kolkata,is,very beautiful city";

		StringTokenizer st = new StringTokenizer(str, ",");

		while (st.hasMoreElements()) {

			Object obj = st.nextElement();

			System.out.println(obj);

		}

	}
}
