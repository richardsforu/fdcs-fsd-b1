package com;

import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Department;
import com.cts.product.entity.Employee;

public class OneToManyFetch {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionbFactory().openSession();

		Department dept = ses.get(Department.class, 10);

		System.out.println("Dept id: " + dept.getDeptId());
		System.out.println("Name: " + dept.getDeptName());
		System.out.println("Location: " + dept.getLocation());

		for (Employee emp : dept.getEmps()) {
			System.out.println("EmpId: " + emp.getEmpId());
			System.out.println("NAme: " + emp.getEmpName());
			System.out.println("Salary: " + emp.getSalary());
			System.out.println("----------------------------------");
		}

		
		

	}

}
