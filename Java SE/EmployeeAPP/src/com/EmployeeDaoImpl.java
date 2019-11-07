package com;

import java.util.List;

public class EmployeeDaoImpl {

	public boolean addEmployee(Employee emp) {

		List<Employee> emps = EmployeeUtil.getList();

		
		return emps.add(emp);
	}

}
