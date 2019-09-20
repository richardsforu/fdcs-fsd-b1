package com;

public class SmallestNumber {

	public static void main(String[] args) {

		int numbers[] = { 387654, 332, 21, 556, 32, 21 };

		int biggest = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] >= biggest ) {
				
				biggest=numbers[i];
				
			}
		}

		System.out.println("Smallest number is "+biggest);

	}

}
