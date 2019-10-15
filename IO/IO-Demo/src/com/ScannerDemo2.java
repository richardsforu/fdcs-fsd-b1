package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		int x = sc.nextInt();

		sc.nextLine(); // dummy to take / read enter key
		
		System.out.println("Enter a String: ");
		String s1 = sc.nextLine();
		
		//System.out.println("Enter a Character: ");
		//String ch=sc.next();
		//System.out.println("Ch: "+ch.charAt(0));
		
	

		System.out.println("S1: " + s1);
		System.out.println("X: " + x);

	}

}
