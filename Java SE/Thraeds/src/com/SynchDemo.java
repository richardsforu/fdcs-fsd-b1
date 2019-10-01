package com;

public class SynchDemo implements Runnable {

	@Override
	public void run() {

		f1();

	}

	synchronized void f1() {
		
		String tname = Thread.currentThread().getName();
		System.out.println("executing f1 method by " + tname);
	}

	public static void main(String[] args) {

		SynchDemo sd = new SynchDemo();

		Thread t1 = new Thread(sd);
		Thread t2 = new Thread(sd);
		Thread t3 = new Thread(sd);

		t1.setName("Accept");
		t2.setName("Process");
		t3.setName("Display");

		t1.start();
		t2.start();
		t3.start();

	}

}
