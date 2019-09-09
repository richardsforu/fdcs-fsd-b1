package com;

public class CallByRef {

	int x; // instance

	public static void main(String[] args) {

		CallByRef c1 = new CallByRef();
		c1.x = 100;

		Sample s = new Sample();
		System.out.println("Before Calling f1: " + c1.x);
		
		s.f1(c1); // Actual argument

		System.out.println("After Calling f1: " + c1.x);

	}

}
