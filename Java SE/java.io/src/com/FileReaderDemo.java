package com;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		try {
			
			File file= new File("src/xyz.txt");
			
			FileReader fr=new FileReader(file);
			
			for(int i=0;i<file.length();i++) {
				System.out.print((char)fr.read());
			}
			
			fr.close();
			
		} catch (Exception e) {
			System.out.println("failed due to "+e);
		}

	}

}
