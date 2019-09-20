package com;

public class BiggestNumber {

	public static void main(String[] args) {

		int numbers[] = { 387654, 332, 21, 11, 32, 21 };

		int small = Integer.MAX_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] <= small ) {
				small=numbers[i];
				
			}
		}

		System.out.println("Smallest number is "+small);

	}

}
