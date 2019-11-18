package com;

public class JdbcTest {

	public static void main(String[] args) {
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("--- Driver class is ,loaded...");
			
		} catch (Exception e) {
			System.out.println("--- Failed due to "+e);
		}
		

	}

}
