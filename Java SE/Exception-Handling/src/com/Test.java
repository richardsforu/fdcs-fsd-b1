package com;

public class Test {

	public static void main(String[] args) {

		System.out.println("Start");
		try {

			int i, j;
			i = 10;
			j = 0;
			int k[] = new int[1];
			k[0] = 1000;
			int x = i / j;
			System.out.println("X: "+x);
			System.out.println(k[0]);

		} catch (ArithmeticException ae) {
			System.out.println("Failed due to " + ae);
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Failed due to " + aiobe);
		} catch (Exception e) {
			System.out.println("failed due to " + e);
		}finally {
			System.out.println("--- Finally ...");
		}
		System.out.println("--- operations");
		System.out.println("End");

	}

}
