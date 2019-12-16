package com.cts.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entity.Product;

@RestController
@RequestMapping("products/api")
public class ProductRestController {
	
	@GetMapping(value = "s1")
	public String f1() {
		return "Message from Spring Rest Service";
	}
	
	
	@GetMapping(value = "s2")
	public ResponseEntity<?> f2() {
		String msg="Welcome to my Application";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@GetMapping(value = "s3")
	public ResponseEntity<?> f3() {
		
		Product prod=new Product();
		prod.setProductId(101);
		prod.setProductName("Laptop");
		prod.setPrice(65324);
		return new ResponseEntity<Product>(prod, HttpStatus.OK);
	}
	
	@GetMapping(value = "s4")
	public ResponseEntity<?> f4() {
		String[] cities= {"Hyderabad","Pune","Kolkata","Bangalore","Chennai"};
		return new ResponseEntity<String[]>(cities, HttpStatus.OK);
	}
	
	
	String[] stores= {"Hyderabad","Bangalore","Kolkata"};
	
	@GetMapping(value = "s5")
	public ResponseEntity<?> f5() {
		
		Product p1=new Product(10, "Pen", 76);
		Product p2=new Product(11, "Book", 736);
		Product p3=new Product(12, "Laptop", 17216);
		Product p4=new Product(13, "Mobile", 8475);
		Product p5=new Product(14, "Mouse", 876);
		
		p2.setStores(stores);
		p5.setStores(stores);
		
		List<Product> prods=new ArrayList<>();
		
		prods.add(p1);
		prods.add(p2);
		prods.add(p3);
		prods.add(p4);
		prods.add(p5);
		
		return new ResponseEntity<List<Product>>(prods, HttpStatus.OK);
	}
	

}
