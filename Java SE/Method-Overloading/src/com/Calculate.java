package com;

public class Calculate {
	
	/*
	 * Method Overloading
	 * ---------------------
	 * 	-> Defining a same method name with different signature  in the same class
	 * 
	 *   Method Signature
	 *   -----------------
	 *   -> name of method
	 *   -> number of arguments
	 *   -> type of arguments
	 *   -> position / order of arguments
	 *   
	 *   Rules for method overloading
	 *   -------------------------------
	 *   -> all methods should have same name
	 *   -> no two methods signature should be same
	 *   
	 *   
	 *   Notes
	 *   -------
	 *   Polymorphism
	 *   --------------
	 *   -> Appearing in many forms
	 *   Types of polymorphism
	 *   
	 *   	1. Static polymorphism / compile time
	 *   	2. dynamic polymorphism / runtime
	 *   
	 *     Method overloading comes under static polymorphism
	 *     Method overriding comes under dynamic polymorphism
	 *     
	 *     
	 *     Method Overridding
	 *     ---------------------
	 *     -> Defining a method with same signature in sub classes 
	 *     
	 */
	
	

	
	

	void f1(long x) {
		System.out.println("Long : "+x);
	}
	
	
	
	void f1(short x) {
		System.out.println("Short : "+x);
	}
	
	void f1(byte x) {
		System.out.println("Byte : "+x);
	}
	void f1(int x) {
		System.out.println("Int : "+x);
	}
	
	//--------------------
	
	

	
	void f1(double x) {
		System.out.println("Double : "+x);
	}
	
	//-------------------

	void f1(String x) {
		System.out.println("String : "+x);
	}
	
	void f1(char x) {
		System.out.println("Char : "+x);
	}
	
	void f1(boolean x) {
		System.out.println("Boolean : "+x);
	}
	
	
	void f1(int x,int y) {
		
	}
	
	void f1(int x,float y) {
		
	}
	

	void f1(float x,int y) {
		
	}
	
	
	public static void main(String[] args) {
		
	
		Calculate c=new Calculate();
		
	//	c.f1(100); // int
	//	c.f1(100L); // long
	//	c.f1((short)100); // short
	//	c.f1((byte)100);  /// byte
	
		//c.f1((byte)100); 
		
		//c.f1(6555.76); // double
		//c.f1(34.56f); // float
		
		
		
		
		
		
		
		
		

	}

}
