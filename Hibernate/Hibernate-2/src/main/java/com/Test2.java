package com;


import org.hibernate.Session;

import com.cts.product.config.DBConfig;

public class Test2 {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionbFactory().openSession();

		Product p = new Product();
		p.setProductId("P003");
		p.setProductName("Bottle");
		p.setPrice(12);

		ses.save(p);

		ses.beginTransaction().commit();

	}

}
