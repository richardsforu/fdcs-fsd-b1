package com.cts.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Controller
public class ProductControiller {

	@Autowired
	private ProductDao prodDao;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/listProducts")
	public String test(Model model) {
		
		List<Product> prods=prodDao.findAll();
		model.addAttribute("products",prods);
		
		return "display";
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
