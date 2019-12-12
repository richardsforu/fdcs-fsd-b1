package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.product.service.ProductServiceImpl;

@Controller
public class ProductControiller {
	
	@Autowired
	private ProductServiceImpl ps;

	@RequestMapping("/s1")
	public void test() {
		ps.testService();
		System.out.println("--- Test method of ProductController");
	}
	
	@RequestMapping("/s2")
	public void test1() {
		System.out.println("--- Test1 method of ProductController");
	}

}
