package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService prodService = ac.getBean(ProductService.class);

		Product prod = new Product();
		prod.setProdId(102);
		prod.setProdName("Book");
		prod.setPrice(635);

		// prodDao.saveProduct(prod);;lk

		for (Product p : prodService.listAll()) {
			System.out.println(p.getProdId());
			System.out.println(p.getProdName());
			System.out.println(p.getPrice());
			System.out.println("-----------------------");
		}

		System.out.println("--- Done");

	}

}
