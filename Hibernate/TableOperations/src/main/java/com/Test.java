package com;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Employee;

public class Test {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionbFactory().openSession();
		Transaction tx = ses.beginTransaction();

		Employee emp = new Employee();
		emp.setEmpId("E001");
		emp.setEmpName("Praveen");
		emp.setSalary(3847834);
		emp.setHno("#10-10/1");
		emp.setStreet("Street-1");
		emp.setCity("Kolkata");
		emp.setProjectName("First Data");
		emp.setProjectLocation("Kolkata");
		ses.save(emp);

		tx.commit();

		System.out.println("-- Done");
	}

}
