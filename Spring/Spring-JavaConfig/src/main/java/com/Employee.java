package com;

import org.springframework.stereotype.Component;

@Component(value = "emp")
public class Employee {

	public Employee() {
		System.out.println("--- Employee Object Created...");
	}

	public void f1() {
		System.out.println("--- Employee class f1 method");
	}

}
