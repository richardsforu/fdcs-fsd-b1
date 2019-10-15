package com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerDemo {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("src/emp.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Employee e1 = (Employee) ois.readObject();

			System.out.println(e1.getEmpId());
			System.out.println(e1.getEmpName());
			System.out.println(e1.getSalary());
			System.out.println(e1.info);

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
