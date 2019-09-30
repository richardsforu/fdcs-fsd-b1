package com;

public class RuntimeExceptionDemo2 {

	public static void main(String[] args) {

		int x;

		x = -100;

		try {
			if (x <= 0) {

				throw new RuntimeException("Number shoubel be...");

			} else {
				System.out.println("Valid Number");
			}

		} catch (Exception e) {
			System.out.println("Invalid Number "+e);
		}

		System.out.println("--- Op1");
		System.out.println("--- Op2");

	}

}
