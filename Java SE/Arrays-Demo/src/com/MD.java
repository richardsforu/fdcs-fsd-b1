package com;

public class MD {

	public static void main(String[] args) {

		int marks[][] = { { 10, 20, 34 }, { 19, 32, 87 }, { 23, 54 } };

		for (int row = 0; row < marks.length; row++) {

			for (int col = 0; col < marks[row].length; col++) {
				System.out.print(marks[row][col] + " ");
			}

			System.out.println();

		}
		//-------------------------------------------------
		
		// using for each loop
		
		System.out.println("-----------------------");
		
		for(int row[]:marks) { // outer
			for(int col:row) { // inner
				System.out.print(col+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		

	}

}
