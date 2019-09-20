package com;

public class Test {

	public static void main(String[] args) {
		
		// We can define arrays in two ways
		// 1-way
		// Every array element has default values.
		
		float x[]= {100,200,300,76}; 
		
		System.out.println(x.length);
		
		System.out.println(x[0]); // 100
		System.out.println(x[1]); // 200
		System.out.println(x[2]); // 300
		System.out.println(x[3]); // 76
		
		System.out.println("-----------------");
		
		// 2 ways to display array elements using  loop
		// way -1 -> for loop
		
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		
		System.out.println("==============");
		for(int i=x.length-1;i>=0;i--)
			System.out.println(x[i]);
		
		// way - 2 -> for each loop -> its iterates only on arrays
		
		System.out.println("---------------");
		
		
		
		for(Object n:x) {
			System.out.println(n);
		}
		
		
		

	}

}
