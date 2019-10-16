package com;

public class GenDemo {

	void f1(int x) {
		System.out.println("Int " + x);
	}

	void f1(float x) {
		System.out.println("Float " + x);
	}

	void f1(double x) {
		System.out.println("Double " + x);
	}

	void f1(long x) {
		System.out.println("Long " + x);
	}

	void f1(short x) {
		System.out.println("Short " + x);
	}

	void f1(String x) {
		System.out.println("String " + x);
	}

	void f1(char x) {
		System.out.println("Char " + x);
	}

	void f1(boolean x) {
		System.out.println("Boolean " + x);
	}

	public static void main(String[] args) {
		
		GenDemo g=new GenDemo();
		g.f1(1000);
		g.f1(763L);
		g.f1("Abc");
		g.f1('J');

	}

}
