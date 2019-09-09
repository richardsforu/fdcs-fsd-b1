package com;

import java.io.PrintStream;
import java.util.Date;

public class C1 {

	void f1() {
		System.out.println("-- f1 method");
	}

	void f2() {
		System.out.println("-- f2 method");
		f1();
		
		C3 c3=new C3();
		c3.f3();
	}
	
	static void f4() {
		
		// ----------------------------------------
		System.out.println("-- f4 method");
	}
	
	
	
	static {
		System.out.println("-- static block 2 ");
	}
	static {
		f4();
		C3 c3=new C3();
		c3.f3();
		System.out.println("-- static block 1 ");
	}
	
	
	
	static {
		System.out.println("-- static block 3 ");
	}

	static public void main(String[] args) {

		System.out.println("1.main");
		C1 c1 = new C1();
		c1.f2();

		/*
		 * C3 c3 = new C3(); c3.printData();
		 * 
		 * C3 c3Obj1 = new C3(); c3Obj1.printData();
		 * 
		 * C3 c3Obj2 = new C3(); C3 c3Obj3 = new C3(); C3 c3Obj4 = new C3();
		 * 
		 * c3Obj2.printData(); c3Obj3.printData(); c3Obj4.printData();
		 * 
		 */

		// --------------------------

		C3 c3Obbj1 = C2.getObject();
		c3Obbj1.printData();

		C3 c3Obbj2 = C2.getObject();
		c3Obbj2.printData();

		C3 c3Obbj3 = C2.getObject();
		c3Obbj3.printData();

		// ------------------------------

		System.out.println("----------");

		C2.getObject().printData();
		C2.getObject().printData();
		C2.getObject().printData();
		C2.getObject().printData();

		System.out.println("-- test");

		PrintStream ps = System.out;
		ps.println("--- testing123");

		System.out.println(new Date());

	}

}
