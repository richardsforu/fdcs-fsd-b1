package com.cts.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.service.ProductServiceImpl;

@Controller
public class ProductControiller {

	@Autowired
	private ProductServiceImpl ps;

	@RequestMapping("/s1")
	public String test() {
		System.out.println("--- Test method of ProductController");
		return "one";
	}

	@RequestMapping("/s2")
	public String test1(Model model) {
		String empName = "Praveen";
		model.addAttribute("ename", empName);
		return "display";
	}

	@RequestMapping("s3")
	public ModelAndView test2() {
		ModelAndView mav = new ModelAndView();
		List<String> cities=new ArrayList<>();
		cities.add("Kolkata");
		cities.add("Pune");
		cities.add("Goa");
		cities.add("Hyderabad");
		cities.add("Bangalore");
		
		String empName = "Ozvitha";
		mav.setViewName("display");
		
		mav.addObject("ename", empName);
		mav.addObject("myCities",cities);
		return mav;
	}

}
