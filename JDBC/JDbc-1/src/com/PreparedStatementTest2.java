package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementTest2 {

	public static void main(String[] args) {
		
		Connection con=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root1234");
		
			PreparedStatement ps=null;
			String qry="insert into f1 values(?)";
			ps=con.prepareStatement(qry);
			
			long st=System.currentTimeMillis();
			
		
			for(int i=1;i<=10000;i++) {
				
				ps.setString(1, "P0"+i);
				ps.executeUpdate();
				
			}
			
			long et=System.currentTimeMillis();
			
			System.out.println("Total Time: "+(et-st));
			
		} catch (Exception e) {
			System.out.println("Failed due to "+e);
		}

	}

}
