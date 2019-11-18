package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) {

		Connection con = null;
		//Connection con1 = null;

		try {

			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("--- Driver class is loaded...");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root1234");
			
			//con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/cts", "productdb", "mypwd");

			System.out.println("-- Connected to " + con.getMetaData().getDatabaseProductName());

			String q1 = "insert into product values('P004','Bottle',555)";

			Statement stmt = con.createStatement();

			int res = stmt.executeUpdate(q1);

			if (res != 0) {
				System.out.println(res + " Records(s) inserted");

			} else {
				System.out.println("-- Some issue while saving...");
			}

		} catch (Exception e) {
			System.out.println("--- Failed due to " + e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
