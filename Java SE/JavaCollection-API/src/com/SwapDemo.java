package com;

public class SwapDemo<E1, E2> {

	void swap(E1 e1, E2 e2) {

		System.out.println("Before: E1: " + e1 + " E2: " + e2);
		Object t = e1;
		e1 = (E1) e2;
		e2 = (E2) t;
		System.out.println("After: E1: " + e1 + " E2: " + e2);

	}

	public static void main(String[] args) {

		SwapDemo<Object, Object> sw = new SwapDemo<>();
		sw.swap(87, 53);
		sw.swap("Praveen", "James");

	}

}
