package com;


import org.hibernate.Session;
import com.cts.product.config.DBConfig;
import com.cts.product.entity.Customer;
import com.cts.product.entity.Product;

public class Test2 {

	public static void main(String[] args){

		Session ses = DBConfig.getSessionbFactory().openSession();
	
		Customer cust=new Customer();
		
		
		cust.setCustName("Praveen");
		cust.setCustAddr("Hyderabad");
		
		ses.save(cust);
		
		//ses.beginTransaction().commit();

		System.out.println(cust.getCustId());
		
	
		
		System.out.println("--- Done");

	}

}
