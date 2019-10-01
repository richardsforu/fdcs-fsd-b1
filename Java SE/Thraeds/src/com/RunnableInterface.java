package com;

public class RunnableInterface  implements Runnable {
	
	@Override
	public void run() {

		f1();

	}

	void f1() {
		
		Object obj;
		
		String tname=Thread.currentThread().getName();
		
		if(tname.equals("First Thread")) {
			try {
				System.out.println(tname+" is sleeping...");
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(tname+" is resumed from the sleep");
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println("I= " + i + " by " + tname);
		}

	}

	public static void main(String[] args) {

		RunnableInterface mt = new RunnableInterface();

		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);

		t1.setName("First Thread");
		t2.setName("Second Thread");
		
		t1.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();

	}

}
