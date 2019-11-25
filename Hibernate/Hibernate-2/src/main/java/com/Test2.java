package com;

import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

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
