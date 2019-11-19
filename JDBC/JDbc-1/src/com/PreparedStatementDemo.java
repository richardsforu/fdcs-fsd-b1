package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementDemo {

	public static void main(String[] args) {

		Connection con = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root1234");

			String q1 = "insert into product values(?,?,?)";

			PreparedStatement ps = con.prepareStatement(q1);

			ps.setString(1, "P005");
			ps.setString(2, "Mouse");
			ps.setDouble(3, 3500);

			int x = ps.executeUpdate();
			System.out.println(x + " records saved");

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
