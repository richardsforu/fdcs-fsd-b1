package com;

public class Test extends Thread{
	@Override
	public void run() {
		
		f1();
		f2();
	}
	

	void f1() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {
			System.out.println("I= " + i);
		}
	}

	void f2() {
		System.out.println(Thread.currentThread().getName());
		for (int j = 1; j <= 10; j++) {
			System.out.println("J= " + j);
		}
	}

	public static void main(String[] args) {
		
		Test t=new Test();
		t.setName("My Thread");
		
		t.start();
		
		
		

	}

}
