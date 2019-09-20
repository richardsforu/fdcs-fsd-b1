package com;

import java.util.Scanner;

public class Use {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// two ways
		// way -1
		int x[] = { 12, 34 };
		int[] x1= {};
		int []x2= {};
		
		
		System.out.println("Enter Range: ");
		int size=sc.nextInt();
		
		int num[] = new int[size];
		int i1[]=new int[10];
		int[] i2=new int[10];
		int []i3=new int[10];
		//[]int i4=new int[10]; invalid
		//int[] i5=new int[] ; // invalid
		//int[10] i6=new int[10]; // invalid
		//int[10] i7=new int[]; // invalid
		
		
		
		
		System.out.println("Enter "+size+" Numbers");
		
		for (int i = 0; i < num.length; i++) {
			
			num[i] = sc.nextInt();
		}

		System.out.println("Numbers: ");
		
		for (int i : num) {
			System.out.println(i);
		}

	}

}
