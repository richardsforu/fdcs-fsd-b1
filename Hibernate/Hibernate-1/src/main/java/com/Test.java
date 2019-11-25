package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		try {

			Configuration cfg = new Configuration();
			cfg.configure();

			SessionFactory sf = cfg.buildSessionFactory();

			Session ses = sf.openSession();

			Product p = new Product();
			p.setPrice(47);
			p.setProductId("P001");
			p.setProductName("Book");

			ses.save(p);
			ses.beginTransaction().commit();

			System.out.println("---- DOne ");

		} catch (Exception e) {
			System.out.println("failed due to " + e);
		}

	}

}
