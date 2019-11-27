package com;


import org.hibernate.Session;
import com.cts.product.config.DBConfig;
import com.cts.product.entity.Customer;
import com.cts.product.entity.Product;

public class Test {

	public static void main(String[] args){

		Session ses = DBConfig.getSessionbFactory().openSession();

		
		Product prod=new Product();
		prod.setProductName("Pen");
		prod.setPrice(444);
		
		ses.save(prod);
		ses.beginTransaction().commit();
		System.out.println("--- Done");

	}

}
