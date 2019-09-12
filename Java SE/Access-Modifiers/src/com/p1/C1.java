package com.p1;

public class C1 {

	int x;

	public void c1publicMethod() {

	}

	void c1Defaultmethod() {

	}

	protected void c1ProtectedMethod() {

	}

	private void c1PrivateMethod() {
		System.out.println("-- private method");
	}

	public static void test() {
		// validations...
		C1 c1 = new C1();
		c1.c1PrivateMethod(); // accepted
	}

	public static void main(String[] args) {

		C2 c2 = new C2();

	}

}
