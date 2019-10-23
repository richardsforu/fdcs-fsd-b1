package com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class SortBySalary implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return (int) (emp1.getSalary() - emp2.getSalary());
	}
}

//-----------

class SortByDob implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getDob().compareTo(emp2.getDob());
	}
}

// ------

class SortByAge implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getAge()-emp2.getAge();
	}
}

public class EmployeeApp {

	public static void main(String[] args) {

		Employee e1 = new Employee(298, "Jfg", 76523, LocalDate.of(1987, 02, 12));
		Employee e2 = new Employee(292, "Sjh", 87582, LocalDate.of(1987, 05, 12));
		Employee e3 = new Employee(198, "Dkj", 13561, LocalDate.of(1978, 01, 23));
		Employee e4 = new Employee(123, "Abc", 54548, LocalDate.of(1990, 8, 21));
		Employee e5 = new Employee(245, "Gfd", 23547, LocalDate.of(1985, 03, 18));
		Employee e6 = new Employee(242, "Kfd", 63544, LocalDate.of(1987, 05, 11));

		ArrayList<Employee> emps = new ArrayList<>();

		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		emps.add(e6);
		System.out.println("Original data");

		Employee.display(emps);

		System.out.println("\nSort by Employee id");

		Collections.sort(emps);

		Employee.display(emps);

		/// ---------------

		System.out.println("\nSort by Employee name");

		Collections.sort(emps, new Employee());

		Employee.display(emps);

		/// ---------------

		System.out.println("\nSort by Employee Salary");

		Collections.sort(emps, new SortBySalary());

		Employee.display(emps);

		/// ---------------

		System.out.println("\nSort by Employee dob");

		Collections.sort(emps, new SortByDob());

		Employee.display(emps);
		
		System.out.println("\nSort by Employee Age");

		Collections.sort(emps, new SortByAge());

		Employee.display(emps);
	}
	
	

}
