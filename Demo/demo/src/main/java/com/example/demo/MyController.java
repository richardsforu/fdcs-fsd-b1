package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
@CrossOrigin
public class MyController {

	@GetMapping
	public String testMsg() {
		return "Sample Message from Server";
	}

	@PostMapping
	public String getData(@PathVariable String abc) {
		System.out.println("-------> "+abc);
		return "I git Data";
	}


}
