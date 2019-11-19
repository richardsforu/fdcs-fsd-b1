package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {

	public static void main(String[] args) {

		Connection con = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root1234");
			
			String q1="select * from product";
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery(q1);
			
			ResultSetMetaData tinfo=rs.getMetaData();
			
			
			//for(int i=1;i<=tinfo.getColumnCount();i++) {
				//System.out.print(tinfo.getColumnName(i)+" \t");
			//}
			
		
		//	System.out.println();
			while(rs.next()==true) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getDouble(3));
				System.out.println("-------------------------");
			}
			
			
			

		} catch (Exception e) {
			System.out.println("--- Failed due to " + e);
		}

	}

}
