package com;

public class C4 {

	static {
		System.out.println("--- One");
	}

	public static void main(String[] args) {

		System.out.println("-- main");
	}

	static {
		System.out.println("--- Two");
	}

}
