package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootDataJpaApplication.class, args);
		
		ProductDao prodDao = ac.getBean(ProductDao.class);

		Product prod = new Product();
		prod.setProductId(12);
		prod.setProductName("Book");
		prod.setPrice(332);

		prodDao.save(prod);
		
		System.out.println("--- Done");

	}

}
