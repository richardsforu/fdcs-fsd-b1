package com;

public class Use {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setEmpId(100);
		e1.setEmpName("James");
		e1.setSalary(384744);

		// System.out.println(e1.getEmpId());
		// System.out.println(e1.getEmpName());
		// System.out.println(e1.getSalary());

		e1.display();

	}

}
