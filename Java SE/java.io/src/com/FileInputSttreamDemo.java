package com;

import java.io.File;
import java.io.FileInputStream;

public class FileInputSttreamDemo {

	public static void main(String[] args) {

		try {
			File fileLoc = new File("src/abc.txt");

			FileInputStream fis = new FileInputStream(fileLoc);

			//System.out.println(fileLoc.length());
			
			for(int i=0;i<fileLoc.length();i++) {
				System.out.print((char)fis.read());
			}

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
