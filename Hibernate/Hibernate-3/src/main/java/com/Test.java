package com;


import org.hibernate.Session;
import com.cts.product.config.DBConfig;
import com.cts.product.entity.Customer;

public class Test {

	public static void main(String[] args){

		Session ses = DBConfig.getSessionbFactory().openSession();

		Customer cust = new Customer();
		cust.setCustId("C002");
		cust.setCustName("James");
		cust.setCustAddr("Pune");

		ses.save(cust);
		ses.beginTransaction().commit();
		System.out.println("--- Done");

	}

}
