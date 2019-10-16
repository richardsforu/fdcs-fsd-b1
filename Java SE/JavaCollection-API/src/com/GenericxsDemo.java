package com;

public class GenericxsDemo<E> {

	void f1(E x) {
		System.out.println(x.getClass().getTypeName() + " " + x);
	}

	public static void main(String[] args) {

		GenericxsDemo g = new GenericxsDemo();

		g.f1(1000);
		g.f1("Praveen");
		g.f1(777L);
		g.f1('A');
		g.f1(true);
		g.f1(666.34f);

	}

}
