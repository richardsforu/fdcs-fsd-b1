package com;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {

	private static List<Employee> emps = null;

	public static List<Employee> getList() {
		if (emps == null) {
			emps = new ArrayList<>();
		}
		return emps;
	}
	
	

}
