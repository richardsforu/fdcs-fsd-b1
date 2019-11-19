package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchUpdate {

	public static void main(String[] args) {
		
		Connection con=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root1234");
			con.setAutoCommit(false);
		
			String q1="insert into product values('P009','Iphone',17500)";
			String q2="update product set product_name='Mac Book pro' where product_id='P001'";
			String q3="delete from product where product_id='P005'";
			
			Statement stmt=con.createStatement();
			
			stmt.addBatch(q1); // adds at 0 index
			stmt.addBatch(q2); // adds at 1 index
			stmt.addBatch(q3); // adds at 2 index
			
			int res[]=stmt.executeBatch();
			/*
			 * res[0] -> 0 or 1 -> 0 means failed, 1 means executed for q1
			 * res[1] -> 0 or 1 -> 0 means failed, 1 means executed for q2
			 * res[2] -> 0 or 1 -> 0 means failed, 1 means executed for q3
			 */
			
			int count=0;
			
			for(int i=0;i<res.length;i++) {
				if(res[i]!=0) {
					count++;
				}
			}
			
			System.out.println(count+" statements executed");
			
			boolean status=true;
			
			for(int i=0;i<res.length;i++) {
				if(res[i]==0) {
					status=false;
				}
			}
			
			if(status) {
				con.commit();
			}else {
				con.rollback();
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println("Failed due to "+e);
		}

	}

}
