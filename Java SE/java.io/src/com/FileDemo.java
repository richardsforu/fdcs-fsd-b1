package com;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {

		String path = "./myfiles";
		File file = new File(path);

		try {

			file.mkdir();
			System.out.println(file.getPath());
			path = file.getPath() + "/abc.txt";
			file = new File(path);
			//if(file.canWrite())
			file.createNewFile();
			// ------
			file.setReadOnly();

			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.isHidden());
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getCanonicalPath());
			System.out.println(file.getParent());
			
			//System.out.println(file.is);

			System.out.println("--- Done");

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
