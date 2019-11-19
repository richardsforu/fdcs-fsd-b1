package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementTest {

	public static void main(String[] args) {
		
		Connection con=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root1234");
		
			Statement stmt=con.createStatement();
			
			long st=System.currentTimeMillis();
		
			for(int i=1;i<=10000;i++) {
				String qry="insert into f1 values('P0"+i+"')";
				stmt.executeUpdate(qry);
			}
			
			long et=System.currentTimeMillis();
			
			System.out.println("Total Time: "+(et-st));
			
		} catch (Exception e) {
			System.out.println("Failed due to "+e);
		}

	}

}
