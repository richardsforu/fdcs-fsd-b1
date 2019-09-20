package com;

public class Sample {

	void f1(int[] dummy) {
		dummy[1]=1000;
		System.out.println("--- f1 method");
		for(int n:dummy) {
			System.out.println(n);
		}
	}
	
	
	public static void main(String[] args) {
		
		int x[]= {65,23,61};
		
		Sample s=new Sample();
		System.out.println("In Main:  Before Call");
		for(int n:x) {
			System.out.println(n);
		}
		
		System.out.println("----------------------");
		s.f1(x);
		
		System.out.println("-----------------------");
		
		System.out.println("In Main:  After Call");
		for(int n:x) {
			System.out.println(n);
		}
	

	}

}
