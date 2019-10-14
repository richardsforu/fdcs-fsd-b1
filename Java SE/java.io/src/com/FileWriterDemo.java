package com;

import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {

		try {

			FileWriter fw = new FileWriter("src/xyz.txt",true);
			String msg = "Welcome to java";
			fw.write(msg);
			System.out.println("-- Writing is done");
			fw.close();

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
