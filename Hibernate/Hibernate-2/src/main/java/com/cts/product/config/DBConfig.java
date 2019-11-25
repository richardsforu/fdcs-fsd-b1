package com.cts.product.config;

import java.util.HashMap;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.Product;

public class DBConfig {

	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionbFactory() {

		StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();

		HashMap<String, String> settings = new HashMap<String, String>();
		settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		settings.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
		settings.put(Environment.USER, "root");
		settings.put(Environment.PASS, "root1234");
		settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		settings.put(Environment.SHOW_SQL, "true");
		settings.put(Environment.HBM2DDL_AUTO, "update");
		settings.put(Environment.FORMAT_SQL, "true");

		registryBuilder.applySettings(settings);

		registry = registryBuilder.build();

		MetadataSources metadataSources = new MetadataSources(registry);
		metadataSources.addAnnotatedClass(Product.class);

		Metadata metadata = metadataSources.getMetadataBuilder().build();

		sessionFactory = metadata.buildSessionFactory();

		return sessionFactory;
	}

}
