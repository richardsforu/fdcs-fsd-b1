package com;

import java.util.List;

import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Department;
import com.cts.product.entity.Employee;

public class ManyToOneFetchDemo {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionbFactory().openSession();

		/*
		 * Employee emp=ses.get(Employee.class, 1024);
		 * System.out.println("EmpId: "+emp.getEmpId());
		 * System.out.println("Name: "+emp.getEmpName());
		 * System.out.println("Salary: "+emp.getSalary());
		 * System.out.println("Dept Id: "+emp.getDept().getDeptId());
		 * System.out.println("Dept Namme: "+emp.getDept().getDeptName());
		 * System.out.println("Dept Loc: "+emp.getDept().getLocation());
		 */

		Integer[] ids = { 10289, 1024, 1025, 1026, 1027, 1028 };

		MultiIdentifierLoadAccess<Employee> multiSelect = ses.byMultipleIds(Employee.class);
		List<Employee> employees = multiSelect.multiLoad(ids);

		for (Employee emp : employees) {

			if (emp == null)
				continue;
			System.out.println("EmpId: " + emp.getEmpId());
			System.out.println("Name: " + emp.getEmpName());
			System.out.println("Salary: " + emp.getSalary());
			System.out.println("Dept Id: " + emp.getDept().getDeptId());
			System.out.println("Dept Namme: " + emp.getDept().getDeptName());
			System.out.println("Dept Loc: " + emp.getDept().getLocation());
			System.out.println("------------------------------------------------");
		}

	}

}
