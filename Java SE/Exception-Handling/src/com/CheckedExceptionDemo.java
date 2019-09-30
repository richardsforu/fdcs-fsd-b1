package com;

public class CheckedExceptionDemo {
	public static void main(String[] args) throws Exception{
		
		
		
	try {
			Class.forName("com.Test1");
			System.out.println("Loaded");
	} catch (ClassNotFoundException e) {
			//System.out.println("failed due to "+e);
			//e.printStackTrace();
		}
		
		
		System.out.println("Ops");
		
		
	}

}
