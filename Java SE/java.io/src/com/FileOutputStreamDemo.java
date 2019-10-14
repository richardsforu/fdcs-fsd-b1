package com;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		try {
			
		

			FileOutputStream fis = new FileOutputStream("src/abc.txt",true);

			String msg = "Welcome to java";

			byte[] data = msg.getBytes();

			fis.write(data);

			System.out.println("--- Writing is done");

		} catch (Exception e) {
			System.out.println("failed due to " + e);
		}

	}

}
