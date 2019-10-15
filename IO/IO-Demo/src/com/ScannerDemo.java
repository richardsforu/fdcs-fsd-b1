package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		File fileLoc = new File("src/abc.txt");

		Scanner sc = null;
		try {
			sc = new Scanner(fileLoc);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("--- Done ");

	}

}
