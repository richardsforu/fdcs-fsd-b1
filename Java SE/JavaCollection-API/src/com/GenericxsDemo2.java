package com;

public class GenericxsDemo2<E> {

	void f1(E x) {
		System.out.println(x.getClass().getTypeName() + " " + x);
	}

	public static void main(String[] args) {

		GenericxsDemo2<Object> g = new GenericxsDemo2<>();
		
		g.f1(1111);
		g.f1("Praveen");
		
		
	

	}

}
