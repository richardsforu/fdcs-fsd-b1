package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemoV1 {

	public static void main(String[] args) {

		File fileLoc = new File("src/abc.txt");
		
	
		
		FileOutputStream fis = null;

		try {

			if (fileLoc.exists())
				fis = new FileOutputStream(fileLoc, true);
			else {
				throw new FileNotFoundException("Specified file does not exists");
			}

			String msg = "Welcome to CPP";

			byte[] data = msg.getBytes();

			//fis.write(data);
			for(int i=0;i<data.length;i++) {
				fis.write(data[i]);
			}

			System.out.println("--- Writing is done");

		} catch (Exception e) {
			System.out.println("failed due to " + e);

		}

		

	}

}
