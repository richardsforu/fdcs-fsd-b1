package com;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Address;
import com.cts.product.entity.Employee;

public class Test {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionbFactory().openSession();
		Transaction tx = ses.beginTransaction();

		Employee emp = new Employee();
		emp.setEmpId("E001");
		emp.setEmpName("Praveen");
		emp.setSalary(3847834);
		
		Address addr=new Address();
		addr.setAddressId("A001");
		addr.setHno("#10-10/1");
		addr.setStreet("Street-1");
		addr.setCity("Kolkata");
		
		emp.setAddr(addr);
		
		ses.save(emp);

		tx.commit();

		System.out.println("-- Done");
	}

}
