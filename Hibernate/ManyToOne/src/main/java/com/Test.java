package com;

import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Department;
import com.cts.product.entity.Employee;

public class Test {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionbFactory().openSession();

		Department d1 = new Department(10, "IT", "Mumbai");
		//Department d2 = new Department(11, "HR", "Kolkata");
		//Department d3 = new Department(12, "Accounts", "Pune");
		//Department d4 = new Department(13, "Training", "Hyderabad");
		//Department d5 = new Department(14, "Admin", "Bangalore");

		Employee e1 = new Employee(1024, "Praveen", 15000);
		Employee e2 = new Employee(1025, "James", 23000);
		Employee e3 = new Employee(1026, "Kavya", 79000);
		Employee e4 = new Employee(1027, "Ozvitha", 12000);
		Employee e5 = new Employee(1028, "Maria", 19000);

		e1.setDept(d1);
		e2.setDept(d1);
		e3.setDept(d1);
		e4.setDept(d1);
		e5.setDept(d1);

		ses.save(e1);
		ses.save(e2);
		ses.save(e3);
		ses.save(e4);
		ses.save(e5);

		ses.beginTransaction().commit();

		System.out.println("--- Done ---");

	}

}
