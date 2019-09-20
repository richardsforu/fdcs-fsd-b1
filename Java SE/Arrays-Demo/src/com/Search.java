package com;

public class Search {

	public static void main(String[] args) {

		int numbers[] = { 34, 332, 21, 556, 32, 21 };

		int key = 21;
		boolean found = false;
		int location = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == key) {
				found = true;
				location = i;
				
			}
		}

		if (found == true) {
			System.out.println(key + " found at " + location);
		} else {
			System.out.println(key + " does not exists");
		}

	}

}
