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

public class Test2 {

	public static void main(String[] args) {

		
		StandardServiceRegistry registry=null;
		SessionFactory sessionFactory=null;
		
		StandardServiceRegistryBuilder registryBuilder=new StandardServiceRegistryBuilder();
		
		
		HashMap<String, String> settings=new HashMap<String, String>();
		settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		settings.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
		settings.put(Environment.USER, "root");
		settings.put(Environment.PASS, "root1234");
		settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		settings.put(Environment.SHOW_SQL, "true");
		settings.put(Environment.HBM2DDL_AUTO, "update");
		settings.put(Environment.FORMAT_SQL, "true");
		
		registryBuilder.applySettings(settings);
		
		registry=registryBuilder.build();
		
		MetadataSources metadataSources=new MetadataSources(registry);
		metadataSources.addAnnotatedClass(Product.class);
		
		Metadata metadata=metadataSources.getMetadataBuilder().build();
		
		sessionFactory=metadata.buildSessionFactory();
		
		
		Session ses=sessionFactory.openSession();
		
		Product p=new Product();
		p.setProductId("P001");
		p.setProductName("Book");
		p.setPrice(12);
		
		ses.save(p);
		
		ses.beginTransaction().commit();
		
	
		
		
		
		
		
		
	}

}
