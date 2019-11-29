package com;

import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Department;
import com.cts.product.entity.Employee;

public class Test {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionbFactory().openSession();

		Employee emp1 = new Employee();
		emp1.setEmpId(1027);
		emp1.setEmpName("Praveen");
		emp1.setSalary(347343);

		Employee emp2 = new Employee();
		emp2.setEmpId(1028);
		emp2.setEmpName("James");
		emp2.setSalary(233445);

		Department d1 = ses.get(Department.class, 12);
		Department d2 = ses.get(Department.class, 10);

		if (d1 != null && d2 != null) {
			emp1.setDept(d1);
			emp2.setDept(d2);
		} else {
			throw new NullPointerException("Department Id Does not exists");
		}

		ses.save(emp1);
		ses.save(emp2);

		ses.beginTransaction().commit();
		System.out.println("--- Done ---");

	}

}
