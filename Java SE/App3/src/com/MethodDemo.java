package com;

public class MethodDemo {

	int f1(int x) {
		x = x + 200;
		System.out.println("In f1: X: " + x);
		return x;

	}

	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();

		int x = 100;
		System.out.println("before f1 Invocation X: " + x);
		int res = m.f1(x);
		System.out.println("after f1 Invocation X: " + res);

	}

}
