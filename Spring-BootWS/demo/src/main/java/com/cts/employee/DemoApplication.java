package com.cts.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.employee.dao.Employee;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(DemoApplication.class, args);
		Employee emp = ac.getBean(Employee.class);
		emp.f1();
	}

}
